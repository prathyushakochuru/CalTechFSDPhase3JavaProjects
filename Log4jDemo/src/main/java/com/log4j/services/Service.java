package com.log4j.services;

import org.apache.log4j.Logger;

import com.log4j.services.Service;

public class Service {
	private static Logger log = Logger.getLogger(Service.class);

	public void service1(String val) {
		log.info("hello from service1 with val : " + val);
		log.info("service1 execution completed");
	}

	public void service2(String val) {
		log.info("hello from service2 with val : " + val);
		log.info("service2 execution completed");
	}

}
