package com.appleyk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.appleyk.node.Context;
import com.appleyk.util.rwfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appleyk.RelationRepository.AssignRepository;
import com.appleyk.RelationRepository.DeviceLocatedInRepository;
import com.appleyk.RelationRepository.IncreaseRepository;
import com.appleyk.RelationRepository.MonitorRepository;
import com.appleyk.RelationRepository.ProvideRepository;
import com.appleyk.RelationRepository.ReduceRepository;
import com.appleyk.RelationRepository.SenseRepository;
import com.appleyk.RelationRepository.ServiceLocatedIn;
import com.appleyk.node.Device;
import com.appleyk.node.Service;
import com.appleyk.repository.ContextRepository;
import com.appleyk.repository.DeviceRepository;
import com.appleyk.repository.LocationRepository;
import com.appleyk.repository.ServiceRepository;
import com.appleyk.repository.UserRepository;

@RestController
public class testVisit {
    @Autowired
    UserRepository userRepository;
    @Autowired
    DeviceRepository deviceRepository;
    @Autowired
    ServiceRepository serviceRepository;
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    ContextRepository contextRepository;
    @Autowired
    ProvideRepository provideRepository;
    @Autowired
    DeviceLocatedInRepository locatedInRepository;
    @Autowired
    ServiceLocatedIn serviceLocatedInRepository;
    @Autowired
    MonitorRepository monitorRepository;
    @Autowired
    IncreaseRepository increaseRepository;
    @Autowired
    ReduceRepository reduceRepository;
    @Autowired
    AssignRepository assignRepository;
    @Autowired
    SenseRepository senseRepository;

    @RequestMapping("/test4")
    public String index() {
        return "Hello World 888";
    }

    @RequestMapping("/fd")
    public void findD() {


        List<Device> dl = (List<Device>) deviceRepository.findAll();
        List<Service> sl = (List<Service>) serviceRepository.findAll();
        List<String> dList = new ArrayList<>();
        Set<String> attrSet = new TreeSet<>();
        Set<String> locSet = new TreeSet<>();
        Set<String> opSet = new TreeSet<>();

        System.out.println("yes");
        System.out.println(dl);
        for (Device d : dl) {
            System.out.println(d.getDName());
            dList.add(d.getDName());
            attrSet.add(d.getKey());
            locSet.add(d.getLName());
        }

        for (Service s : sl) {
            opSet.add(s.getEffect());
        }


        System.out.println(dList);
        System.out.println(attrSet);
        System.out.println(opSet);

//		
//		System.out.println(deviceRepository.count());
//		System.out.println(deviceRepository.exists(5L));

//		List<Device> dl2 = deviceRepository.getDevicesByDName(dname);
//		System.out.println(dl2);
//		
//		
//		List<Device> dl3 = deviceRepository.getdname(dname);
//		System.out.println(dl3);
//		
//		System.out.println(deviceRepository.findById(3L).getDName());
    }

    @RequestMapping("/vbd")
    public void vbDevice() {

        List<Device> dl = (List<Device>) deviceRepository.findAll();
//        List<Service> sl = (List<Service>) serviceRepository.findAll();
        List<String> result = new ArrayList<>();

        for (Device d : dl) {
            String s1, s2, s3, s4, s5, s6, s7, s8;
            s1 = "turn on the " + d.getDName() + " in the " + d.getLName()+" .";
            s2 = "turn off the " + d.getDName() + " in the " + d.getLName()+" .";
            s3 = "open the " + d.getDName() + " in the " + d.getLName()+" .";
            s4 = "shut down the " + d.getDName() + " in the " + d.getLName()+" .";

            s5 = "set the " + d.getKey() + " of the " + d.getDName() + " in the " + d.getLName() + " to x .";
            s6 = "turn the " + d.getKey() + " of the " + d.getDName() + " in the " + d.getLName() + " to x .";
//            s7 = "set the " + d.getKey() + " in the " + d.getLName() + " to x";
//            s8 = "turn the " + d.getKey() + " in the " + d.getLName() + " to x";
            result.add(s1.toLowerCase());
            result.add(s2.toLowerCase());
            result.add(s3.toLowerCase());
            result.add(s4.toLowerCase());
            result.add(s5.toLowerCase());
            result.add(s6.toLowerCase());
//            result.add(s7.toLowerCase());
//            result.add(s8.toLowerCase());

        }


        for (Device d : dl) {
            String s1 = "What is the Status" + " of the " + d.getDName()+" ?";
            String s2 = "Is the " + d.getDName() + " on ?";
            String s3 = "Is the " + d.getDName() + " off ?";
//            System.out.println(s1);
            result.add(s1.toLowerCase());
            result.add(s2.toLowerCase());
            result.add(s3.toLowerCase());

        }
        for (Device d : dl) {
            String s = "What is the " + d.getKey() + " of the " + d.getDName()+" ?";
            result.add(s.toLowerCase());

        }
        rwfile.writeFile(result, "vbd0613");


    }

    @RequestMapping("/vbc")
    public void vbContext() {

        List<Service> sl = (List<Service>) serviceRepository.findAll();
        List<Context> cl = (List<Context>) contextRepository.findAll();
        List<String> result = new ArrayList<>();

        for (Context c : cl) {

            for (Service s : sl) {
                if (s.getCType().equals(c.getCType()) && s.getLName().equals(c.getLName())) {
                    String sentence = s.getEffect() + " the " + s.getCType() + " of " + s.getLName()+" .";

                    result.add(sentence.toLowerCase());
                }
            }
        }

        for (Context c : cl) {
            String sentence = "What is the " + c.getCType() + " in the " + c.getLName()+" ?";

            result.add(sentence.toLowerCase());
        }


        for (Context c : cl) {
            String sentence = "set the " + c.getCType() + " of " + c.getLName() + " to x .";
            result.add(sentence.toLowerCase());
        }


        rwfile.writeFile(result, "vbc0613");
    }

    @RequestMapping("/ta")
    public void triggerAction() {

        List<Device> dl = (List<Device>) deviceRepository.findAll();
        List<Service> sl = (List<Service>) serviceRepository.findAll();
        List<Context> cl = (List<Context>) contextRepository.findAll();
        List<String> result = new ArrayList<>();

        for (Context c : cl) {

//            System.out.println("If the "+c.getCType()+" of the "+c.getLName()+" is below "+c.getRMin()+", ");

            for (Device d : dl) {
                if (d.getKey().equals(c.getCType())) {
                    String s = "If the " + c.getCType() + " of the " + c.getLName() + " is below " + c.getRMin() + ", " + "Turn on the " + d.getDName() + ".";
                    System.out.println(s);
                    result.add(s.toLowerCase());
                }
            }

//            System.out.println("If the "+c.getCType()+" of the "+c.getLName()+" is below "+c.getRMin()+", ");

            for (Service s : sl) {
                if (s.getEffect().equals("Increase") && s.getCType().equals(c.getCType())) {
                    String ss = "If the " + c.getCType() + " of the " + c.getLName() + " is below " + c.getRMin() + ", " + s.getEffect() + " the value of " + s.getCType() + ".";
                    System.out.println(ss);
                    result.add(ss.toLowerCase());
                }
            }

        }
        rwfile.writeFile(result, "ta");
//        for(Context c:cl){
//
//            System.out.println("If the "+c.getCType()+" of the "+c.getLName()+" is more than "+c.getRMax()+", ");
//
//            for(Device d:dl){
//                if(d.getKey().equals(c.getCType())){
//                    System.out.println("Turn on the "+d.getDName()+".");
//                }
//            }
//            for(Service s:sl){
//                if(s.getEffect().equals("Reduce")&&s.getCType().equals(c.getCType())){
//                    System.out.println(s.getEffect()+" the value of "+s.getCType()+".");
//                }
//            }
//        }


    }


    @RequestMapping("/ta2")
    public void triggerAction2() {
        List<Context> cl = (List<Context>) contextRepository.findAll();
        List<String> result = new ArrayList<>();

        for (Context c : cl) {
            String s1 = "if the " + c.getCType() + " in the " + c.getLName() + " is below x";
            String s2 = "if the " + c.getCType() + " in the " + c.getLName() + " is less than x";
            String s3 = "if the " + c.getCType() + " of the " + c.getLName() + " is lower than x";
            String s4 = "if the " + c.getCType() + " in the " + c.getLName() + " is above x";
            String s5 = "if the " + c.getCType() + " in the " + c.getLName() + " is higher than x";
            String s6 = "if the " + c.getCType() + " in the " + c.getLName() + " is more than x";
            String s7 = "if the " + c.getCType() + " in the " + c.getLName() + " is between x and y";
            result.add(s1.toLowerCase());
            result.add(s2.toLowerCase());
            result.add(s3.toLowerCase());
            result.add(s4.toLowerCase());
            result.add(s5.toLowerCase());
            result.add(s6.toLowerCase());
            result.add(s7.toLowerCase());

        }

        for(String i : result){
            System.out.println(i);
        }

        rwfile.writeFile(result, "ta0613");

    }


}
