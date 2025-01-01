package com.conestoga.designPatttern.factory;

public class FactoryImplementation {
	CarFactory carFactory = new CarFactory();
	Car car = carFactory.getCarObject("innova");
}
