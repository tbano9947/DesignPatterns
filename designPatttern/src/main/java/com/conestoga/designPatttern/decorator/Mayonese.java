package com.conestoga.designPatttern.decorator;

public class Mayonese extends PizzaDecorator {

	public Mayonese(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	public int addCost() {
		return 5+pizza.addCost();
	}

}
