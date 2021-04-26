package com.calc.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.calc.service.CalcService;

public class ConsumerMain {

	public static void main(String[] args) {
   String endpoint="http://localhost:7000/Calculate?wsdl";
		
		try {
			URL url=new URL(endpoint);
			
			QName qName=new QName("http://serviceImpl.calc.com/", "CalcServiceImplService");
			/*
			 * Param 1 in Qname is the xmlns:tns(targetnamespace) and 
			 * Param2 is the service name which is associated with name attribute in the same tag
			 */
			
			Service service=Service.create(url,qName);
			CalcService calc = service.getPort(CalcService.class);
			
			System.out.println("Accessing the services in client side");
			System.out.println(calc.sum(2,3));
			System.out.println(calc.diff(167, 90));
			System.out.println(calc.multiply(2,3));
			System.out.println(calc.divide(167, 90));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
