package com.conestoga.designPatttern.decorator;

public class Jalapeno extends PizzaDecorator {

	public Jalapeno(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	public int addCost() {
		return 10+pizza.addCost();
	}

}
