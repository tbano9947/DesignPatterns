package com.conestoga.designPatttern.factory;

public class Fortuner implements Car{
	Fortuner(){
	System.out.println("tHIS IS FORTUNER constructor");
	}
	public void getCar() {
		System.out.println("This is a Fortuner");
	}
}
