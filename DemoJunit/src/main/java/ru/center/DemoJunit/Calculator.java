package ru.center.DemoJunit;

public class Calculator {
	CalculatorService service;// without implementation we can't test our program
	public Calculator(CalculatorService service) {
		this.service=service;
	}
	public int perform(int i, int j) { // 2+3->(i+j)*i
	
		return service.add(i, j)*i;// servce используется и verify работает в Test
	//	return (i+j)*i;// Как узнать, что исп-ся сервис mock
	}
}
