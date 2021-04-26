package com.calc.producer;

import javax.xml.ws.Endpoint;

import com.calc.serviceImpl.CalcServiceImpl;

public class PublisherMain {

	public static void main(String[] args) {
		String url="http://localhost:7000/Calculate";
		Endpoint.publish(url, new CalcServiceImpl());
		
		System.out.println("Hello your service is published successfully on the below url.... You can access it from any of your favourite browser or access it from creating a client");
		System.out.println(url+"?wsdl");

	}

}
