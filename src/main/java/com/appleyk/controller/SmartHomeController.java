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
public class SmartHomeController {
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

	@RequestMapping("/createSmartHomeNode")
	public void createSmartHomeNode() {
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


		devicesNodes.add(dNode1);
		devicesNodes.add(dNode2);
		devicesNodes.add(dNode3);
		devicesNodes.add(dNode4);
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
		service5.setDName("smart Light");
		service5.setState("Off");
		service5.setValue(22);

		Service service6 = new Service();
		service6.setName("S22");
		service6.setLName("sitting room");
		service6.setCType("Brightness");
		service6.setEffect("Increase");
		service6.setDName("smart Light");
		service6.setState("Off");
		service6.setValue(22);

		Service service7 = new Service();
		service7.setName("S23");
		service7.setLName("sitting room");
		service7.setCType("Brightness");
		service7.setEffect("Assign");
		service7.setDName("smart Light");
		service7.setState("Off");
		service7.setValue(22);

		Service service71 = new Service();
		service71.setName("S24");
		service71.setLName("sitting room");
		service71.setCType("Brightness");
		service71.setEffect("Reduce");
		service71.setDName("smart Light");
		service71.setState("Off");
		service71.setValue(22);
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
		

		servicesNodes.add(service1);
		servicesNodes.add(service2);
		servicesNodes.add(service3);
		servicesNodes.add(service4);
		servicesNodes.add(service5);
		servicesNodes.add(service6);
		servicesNodes.add(service7);
		servicesNodes.add(service71);
		servicesNodes.add(service8);
		servicesNodes.add(service9);
		
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


		locationsNodes.add(location1);
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


		User uNode3 = new User();
		uNode3.setUName("Sansevieria");
		uNode3.setNN("U3");
		uNode3.setLName("sitting room");


		usersNodes.add(uNode1);
		usersNodes.add(uNode3);
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

		

		contextsNodes.add(cNode11);
		contextsNodes.add(cNode13);
		contextsNodes.add(cNode14);
		contextsNodes.add(cNode31);
		contextsNodes.add(cNode33);

		contextRepository.save(contextsNodes);

	}

	@RequestMapping("/createSmartHomeRelation")
	public void createSmartHomeRelation() {
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
