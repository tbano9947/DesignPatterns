package com.conestoga.designPatttern.decorator;

public class CheesePizza extends PizzaDecorator {
public CheesePizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	public int addCost() {
		return 20+pizza.addCost();
	}
}
