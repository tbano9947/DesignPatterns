package com.conestoga.designPatttern.factory;

public class CarFactory {
	
	public CarFactory(){
		System.out.println("this is a car factory");
	}
 public Car getCarObject(String car)
 {
	
	 if(car.equals("Innova"))
	 {
		 Car innova =new Innova();
		 return innova;
	 }
	 else if(car.equals("Etios")){
		 Car etios = new Etios();
		 return etios;
	 }
	 else
	 {
		 Car fortuner = new Fortuner();
		 return fortuner;
	 }
 }
}
