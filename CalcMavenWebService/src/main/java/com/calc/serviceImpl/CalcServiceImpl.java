package com.calc.serviceImpl;

import javax.jws.WebService;

import com.calc.service.CalcService;

@WebService(endpointInterface = "com.calc.service.CalcService")
public class CalcServiceImpl implements CalcService{

	@Override
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}

	@Override
	public int diff(int a, int b) {
		int c = a-b;
		return c;
	}

	@Override
	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	@Override
	public int divide(int a, int b) {
		int c = a / b;
		return c;
	}

}
