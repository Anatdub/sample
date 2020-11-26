package ru.center.DemoJunit;

public class Calculator2 {
	CalculatorService service;// without implementation we can't test our program
	public Calculator2(CalculatorService service) {
		this.service=service;
	}
	public int perform(int i, int j) { // 2+3->(i+j)*i
	
		return service.add(i, j)*i;
}
}
