package com.appleyk.controller;

import java.util.ArrayList;
import java.util.List;

import com.appleyk.RelationRepository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appleyk.node.Context;
import com.appleyk.node.Device;
import com.appleyk.node.Location;
import com.appleyk.node.Service;
import com.appleyk.node.User;
import com.appleyk.repository.ContextRepository;
import com.appleyk.repository.DeviceRepository;
import com.appleyk.repository.LocationRepository;
import com.appleyk.repository.ServiceRepository;
import com.appleyk.repository.UserRepository;

@RestController
public class SmartHomeController2 {
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
    DeviceLocatedInRepository devicelocatedInRepository;
    @Autowired
    ServiceLocatedIn serviceLocatedInRepository;
    @Autowired
    ContextLocatedInRepository contextLocatedInRepository;
    @Autowired
    UserLocatedInRepository userLocatedInRepository;
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

    @RequestMapping("/createSmartHomeNode2")
    public void createSmartHomeNode2() {
        List<Device> devicesNodes = new ArrayList<>();
        Device dNode1 = new Device();
        dNode1.setNN("D1");
        dNode1.setDName("air conditioner");
        dNode1.setLName("sitting room");
        dNode1.setKey("Temperature");
        dNode1.setStatus("off");
        dNode1.setValue(22);

        Device dNode2 = new Device();
        dNode2.setNN("D2");
        dNode2.setDName("smart Light");
        dNode2.setLName("sitting room");
        dNode2.setKey("Brightness");
        dNode2.setStatus("off");
        dNode2.setValue(22);

        Device dNode3 = new Device();
        dNode3.setNN("D3");
        dNode3.setDName("pm2.5 monitor");
        dNode3.setLName("sitting room");
        dNode3.setKey("PM2.5");
        dNode3.setStatus("off");
        dNode3.setValue(22);

        Device dNode4 = new Device();
        dNode4.setNN("D4");
        dNode4.setDName("air purifier");
        dNode4.setLName("sitting room");
        dNode4.setKey("PM2.5");
        dNode4.setStatus("off");
        dNode4.setValue(22);

        Device dNode5 = new Device();
        dNode5.setNN("D5");
        dNode5.setDName("air conditioner");
        dNode5.setLName("bedroom");
        dNode5.setKey("Temperature");
        dNode5.setStatus("off");
        dNode5.setValue(22);

        Device dNode6 = new Device();
        dNode6.setNN("D6");
        dNode6.setDName("smart light");
        dNode6.setLName("bedroom");
        dNode6.setKey("Brightness");
        dNode6.setStatus("off");
        dNode6.setValue(22);

        Device dNode7 = new Device();
        dNode7.setNN("D7");
        dNode7.setDName("flower monitor");
        dNode7.setLName("balcony");
        dNode7.setKey("Humidity");
        dNode7.setStatus("off");
        dNode7.setValue(22);

        Device dNode8 = new Device();
        dNode8.setNN("D8");
        dNode8.setDName("water pump");
        dNode8.setLName("balcony");
        dNode8.setKey("Humidity");
        dNode8.setStatus("off");
        dNode8.setValue(22);

        Device dNode9 = new Device();
        dNode9.setNN("D9");
        dNode9.setDName("smart fan");
        dNode9.setLName("sitting room");
        dNode9.setKey("Temperature");
        dNode9.setStatus("off");
        dNode9.setValue(22);

        devicesNodes.add(dNode1);
        devicesNodes.add(dNode2);
        devicesNodes.add(dNode3);
        devicesNodes.add(dNode4);
        devicesNodes.add(dNode5);
        devicesNodes.add(dNode6);
        devicesNodes.add(dNode7);
        devicesNodes.add(dNode8);
        devicesNodes.add(dNode9);
        deviceRepository.save(devicesNodes);
        /**
         *
         *
         *
         *
         */
        List<Service> servicesNodes = new ArrayList<>();
        // 空调
        Service service1 = new Service();
        service1.setName("S11");
        service1.setLName("sitting room");
        service1.setCType("Temperature");
        service1.setEffect("Monitor");
        service1.setDName("air conditioner");
        service1.setState("off");
        service1.setValue(22);

        Service service2 = new Service();
        service2.setName("S12");
        service2.setLName("sitting room");
        service2.setCType("Temperature");
        service2.setEffect("Increase");
        service2.setDName("air conditioner");
        service2.setState("off");
        service2.setValue(22);

        Service service3 = new Service();
        service3.setName("S13");
        service3.setLName("sitting room");
        service3.setCType("Temperature");
        service3.setEffect("Reduce");
        service3.setDName("air conditioner");
        service3.setState("off");
        service3.setValue(22);

        Service service4 = new Service();
        service4.setName("S14");
        service4.setLName("sitting room");
        service4.setCType("Temperature");
        service4.setEffect("Assign");
        service4.setDName("air conditioner");
        service4.setState("off");
        service4.setValue(22);
        // 灯
        Service service5 = new Service();
        service5.setName("S21");
        service5.setLName("sitting room");
        service5.setCType("Brightness");
        service5.setEffect("Monitor");
        service5.setDName("smart light");
        service5.setState("Off");
        service5.setValue(22);

        Service service6 = new Service();
        service6.setName("S22");
        service6.setLName("sitting room");
        service6.setCType("Brightness");
        service6.setEffect("Increase");
        service6.setDName("smart light");
        service6.setState("Off");
        service6.setValue(22);

        Service service7 = new Service();
        service7.setName("S23");
        service7.setLName("sitting room");
        service7.setCType("Brightness");
        service7.setEffect("Assign");
        service7.setDName("smart light");
        service7.setState("Off");
        service7.setValue(22);
        // pm检测
        Service service8 = new Service();
        service8.setName("S31");
        service8.setLName("sitting room");
        service8.setCType("PM2.5");
        service8.setEffect("Monitor");
        service8.setDName("pm2.5 monitor");
        service8.setState("Off");
        service8.setValue(22);
        // 空气净化器
        Service service9 = new Service();
        service9.setName("S41");
        service9.setLName("sitting room");
        service9.setCType("PM2.5");
        service9.setEffect("Reduce");
        service9.setDName("air purifier");
        service9.setState("Off");
        service9.setValue(22);

        //卧室空调
        Service service10 = new Service();
        service10.setName("S51");
        service10.setLName("bedroom");
        service10.setCType("Temperature");
        service10.setEffect("Monitor");
        service10.setDName("air conditioner");
        service10.setState("Off");
        service10.setValue(22);

        Service service11 = new Service();
        service11.setName("S52");
        service11.setLName("bedroom");
        service11.setCType("Temperature");
        service11.setEffect("Increase");
        service11.setDName("air conditioner");
        service11.setState("Off");
        service11.setValue(22);

        Service service12 = new Service();
        service12.setName("S53");
        service12.setLName("bedroom");
        service12.setCType("Temperature");
        service12.setEffect("Reduce");
        service12.setDName("air conditioner");
        service12.setState("Off");
        service12.setValue(22);

        Service service13 = new Service();
        service13.setName("S54");
        service13.setLName("bedroom");
        service13.setCType("Temperature");
        service13.setEffect("Assign");
        service13.setDName("air conditioner");
        service13.setState("Off");
        service13.setValue(22);
        //卧室的灯
        Service service14 = new Service();
        service14.setName("S61");
        service14.setLName("bedroom");
        service14.setCType("Brightness");
        service14.setEffect("Monitor");
        service14.setDName("smart light");
        service14.setState("Off");
        service14.setValue(22);

        Service service15 = new Service();
        service15.setName("S62");
        service15.setLName("bedroom");
        service15.setCType("Brightness");
        service15.setEffect("Increase");
        service15.setDName("smart light");
        service15.setState("Off");
        service15.setValue(22);

        Service service16 = new Service();
        service16.setName("S63");
        service16.setLName("bedroom");
        service16.setCType("Brightness");
        service16.setEffect("Assign");
        service16.setDName("smart light");
        service16.setState("Off");
        service16.setValue(22);
        //阳台花草检测仪
        Service service17 = new Service();
        service17.setName("S71");
        service17.setLName("balcony");
        service17.setCType("Humidity");
        service17.setEffect("Monitor");
        service17.setDName("flower monitor");
        service17.setState("Off");
        service17.setValue(22);

        Service service18 = new Service();
        service18.setName("S81");
        service18.setLName("balcony");
        service18.setCType("Humidity");
        service18.setEffect("Increase");
        service18.setDName("water pump");
        service18.setState("Off");
        service18.setValue(22);

        Service service19 = new Service();
        service19.setName("S92");
        service19.setLName("sitting room");
        service19.setCType("Temperature");
        service19.setEffect("Increase");
        service19.setDName("smart fan");
        service19.setState("off");
        service19.setValue(22);

        Service service20 = new Service();
        service20.setName("S93");
        service20.setLName("sitting room");
        service20.setCType("Temperature");
        service20.setEffect("Reduce");
        service20.setDName("smart fan");
        service20.setState("off");
        service20.setValue(22);

        Service service21 = new Service();
        service21.setName("S94");
        service21.setLName("sitting room");
        service21.setCType("Temperature");
        service21.setEffect("Assign");
        service21.setDName("smart fan");
        service21.setState("off");
        service21.setValue(22);

        servicesNodes.add(service1);
        servicesNodes.add(service2);
        servicesNodes.add(service3);
        servicesNodes.add(service4);
        servicesNodes.add(service5);
        servicesNodes.add(service6);
        servicesNodes.add(service7);
        servicesNodes.add(service8);
        servicesNodes.add(service9);
        servicesNodes.add(service10);
        servicesNodes.add(service11);
        servicesNodes.add(service12);
        servicesNodes.add(service13);
        servicesNodes.add(service14);
        servicesNodes.add(service15);
        servicesNodes.add(service16);
        servicesNodes.add(service17);
        servicesNodes.add(service18);
        servicesNodes.add(service19);
        servicesNodes.add(service20);
        servicesNodes.add(service21);


        serviceRepository.save(servicesNodes);
        /**
         *
         *
         *
         *
         */
        List<Location> locationsNodes = new ArrayList<>();

        Location location1 = new Location();
        location1.setNN("L1");
        location1.setLName("sitting room");

        Location location2 = new Location();
        location2.setNN("L2");
        location2.setLName("bedroom");

        Location location3 = new Location();
        location3.setNN("L3");
        location3.setLName("balcony");

        locationsNodes.add(location1);
        locationsNodes.add(location2);
        locationsNodes.add(location3);
        locationRepository.save(locationsNodes);
        /**
         *
         *
         *
         *
         */
        List<User> usersNodes = new ArrayList<>();
        User uNode1 = new User();
        uNode1.setUName("Jack");
        uNode1.setNN("U1");
        uNode1.setLName("sitting room");

        User uNode2 = new User();
        uNode2.setUName("Ken");
        uNode2.setNN("U2");
        uNode2.setLName("bedroom");

        User uNode3 = new User();
        uNode3.setUName("Sansevieria");
        uNode3.setNN("U3");
        uNode3.setLName("sitting room");

        User uNode4 = new User();
        uNode4.setUName("Cactus");
        uNode4.setNN("U4");
        uNode4.setLName("balcony");

        User uNode5 = new User();
        uNode5.setUName("Lily");
        uNode5.setNN("U5");
        uNode5.setLName("balcony");

        usersNodes.add(uNode1);
        usersNodes.add(uNode2);
        usersNodes.add(uNode3);
        usersNodes.add(uNode4);
        usersNodes.add(uNode5);
        userRepository.save(usersNodes);
        /**
         *
         *
         *
         *
         */
        List<Context> contextsNodes = new ArrayList<>();
        Context cNode11 = new Context();
        cNode11.setUName("Jack");
        cNode11.setLName("sitting room");
        cNode11.setCType("Temperature");
        cNode11.setValue(22);
        cNode11.setRMin(19);
        cNode11.setRMax(26);
        cNode11.setNN("C11");

        Context cNode13 = new Context();
        cNode13.setUName("Jack");
        cNode13.setLName("sitting room");
        cNode13.setCType("Brightness");
        cNode13.setValue(22);
        cNode13.setRMin(20);
        cNode13.setRMax(100);
        cNode13.setNN("C13");

        Context cNode14 = new Context();
        cNode14.setUName("Jack");
        cNode14.setLName("sitting room");
        cNode14.setCType("PM2.5");
        cNode14.setValue(22);
        cNode14.setRMin(0);
        cNode14.setRMax(35);
        cNode14.setNN("C14");

        Context cNode21 = new Context();
        cNode21.setUName("Ken");
        cNode21.setLName("bedroom");
        cNode21.setCType("Temperature");
        cNode21.setValue(22);
        cNode21.setRMin(22);
        cNode21.setRMax(26);
        cNode21.setNN("C21");

        Context cNode23 = new Context();
        cNode23.setUName("Ken");
        cNode23.setLName("bedroom");
        cNode23.setCType("Brightness");
        cNode23.setValue(22);
        cNode23.setRMin(20);
        cNode23.setRMax(100);
        cNode23.setNN("C23");

        Context cNode24 = new Context();
        cNode24.setUName("Ken");
        cNode24.setLName("bedroom");
        cNode24.setCType("PM2.5");
        cNode24.setValue(22);
        cNode24.setRMin(0);
        cNode24.setRMax(35);
        cNode24.setNN("C24");

        Context cNode31 = new Context();
        cNode31.setUName("Sansevieria");
        cNode31.setLName("sitting room");
        cNode31.setCType("Temperature");
        cNode31.setValue(22);
        cNode31.setRMin(10);
        cNode31.setRMax(35);
        cNode31.setNN("C31");

        Context cNode33 = new Context();
        cNode33.setUName("Sansevieria");
        cNode33.setLName("sitting room");
        cNode33.setCType("Brightness");
        cNode33.setValue(22);
        cNode33.setRMin(20);
        cNode33.setRMax(100);
        cNode33.setNN("C33");

        Context cNode42 = new Context();
        cNode42.setUName("Cactus");
        cNode42.setLName("balcony");
        cNode42.setCType("Humidity");
        cNode42.setValue(22);
        cNode42.setRMin(20);
        cNode42.setRMax(100);
        cNode42.setNN("C42");

        Context cNode43 = new Context();
        cNode43.setUName("Cactus");
        cNode43.setLName("balcony");
        cNode43.setCType("Brightness");
        cNode43.setValue(22);
        cNode43.setRMin(80);
        cNode43.setRMax(100);
        cNode43.setNN("C43");

        Context cNode52 = new Context();
        cNode52.setUName("Lily");
        cNode52.setLName("balcony");
        cNode52.setCType("Humidity");
        cNode52.setValue(22);
        cNode52.setRMin(60);
        cNode52.setRMax(100);
        cNode52.setNN("C52");

        Context cNode53 = new Context();
        cNode53.setUName("Lily");
        cNode53.setLName("balcony");
        cNode53.setCType("Brightness");
        cNode53.setValue(22);
        cNode53.setRMin(70);
        cNode53.setRMax(100);
        cNode53.setNN("C53");


        contextsNodes.add(cNode11);
        contextsNodes.add(cNode13);
        contextsNodes.add(cNode14);
        contextsNodes.add(cNode21);
        contextsNodes.add(cNode23);
        contextsNodes.add(cNode24);
        contextsNodes.add(cNode31);
        contextsNodes.add(cNode33);
        contextsNodes.add(cNode42);
        contextsNodes.add(cNode43);
        contextsNodes.add(cNode52);
        contextsNodes.add(cNode53);
        contextRepository.save(contextsNodes);

    }

    @RequestMapping("/createSmartHomeRelation2")
    public void createSmartHomeRelation2() {
        provideRepository.createProvide();
        devicelocatedInRepository.createlocatedIn();
        serviceLocatedInRepository.createservicelocatedIn();
        userLocatedInRepository.createlocatedIn();
        contextLocatedInRepository.createlocatedIn();
        monitorRepository.createMonitor();
        increaseRepository.createIncrease();
        reduceRepository.createReduce();
        assignRepository.createAssign();
        senseRepository.createSense();
    }

}
