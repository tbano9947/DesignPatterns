package com.conestoga.designPatttern.decorator;

public class PizzaDecorator implements Pizza{
	protected Pizza pizza;
	public PizzaDecorator(Pizza pizza)
	{
		this.pizza=pizza;
	}
	

	@Override
	public int addCost() {
		// TODO Auto-generated method stub
		return pizza.addCost();
	}

}
