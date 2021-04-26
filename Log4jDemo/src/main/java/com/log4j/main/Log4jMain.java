package com.log4j.main;

import org.apache.log4j.Logger;

import com.log4j.main.Log4jMain;
import com.log4j.services.Service;

public class Log4jMain {
	private static Logger log=Logger.getLogger(Log4jMain.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.trace("Hello from TRACE");
		log.debug("Hello from DEBUG");
		log.info("Hello from INFO");
		log.warn("Hello from WARN");
		log.error("Hello from ERROR");
		log.fatal("Hello from FATAL");
		
		
		Service service=new Service();
		service.service1("test service1");
		service.service2("test service2");

	}

}
