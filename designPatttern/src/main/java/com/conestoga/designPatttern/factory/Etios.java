package com.conestoga.designPatttern.factory;

public class Etios implements Car{

	public Etios() {
		System.out.println("this is etios constructor");
	}

	@Override
	public void getCar() {
		// TODO Auto-generated method stub
		System.out.println("this is etios");
	}

}
