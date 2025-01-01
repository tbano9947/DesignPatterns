package com.conestoga.designPatttern;

import com.conestoga.designPatttern.decorator.Pizza;
import com.conestoga.designPatttern.decorator.BasePizza;
import com.conestoga.designPatttern.decorator.CheesePizza;
import com.conestoga.designPatttern.decorator.Jalapeno;
import com.conestoga.designPatttern.decorator.Mayonese;
import com.conestoga.designPatttern.factory.Car;
import com.conestoga.designPatttern.factory.CarFactory;
import com.conestoga.designPatttern.observer.BlrStation;
import com.conestoga.designPatttern.observer.JsrStation;
import com.conestoga.designPatttern.observer.RncStation;
import com.conestoga.designPatttern.observer.WeatherData;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       // System.out.println("Hello World!");
     // FactoryImplementation factoryImplementation = new FactoryImplementation();
        //factory design
    	System.out.println("-----------------");
        System.out.println("factory pattern");
        System.out.println("-----------------");
        CarFactory carFactory = new CarFactory();
    	Car innova = carFactory.getCarObject("Etios");
    	innova.getCar();
    	System.out.println("-----------------");
    	//factory design
    	//decorator design
    	System.out.println("Decorator pattern");
    	System.out.println("-----------------");
    	Pizza basePizza = new BasePizza();
    	Pizza cheesePizza = new CheesePizza(basePizza);
    	//Pizza jalapeno = new Jalapeno(cheesePizza);
    	Pizza mayonese = new Mayonese(cheesePizza);
    	System.out.println("cost is"+mayonese.addCost());
    	System.out.println("-----------------");
    	//decorator design
    	//observer design
    	System.out.println("Observer pattern");
    	System.out.println("-----------------");
    	WeatherData weatherdata = new WeatherData();
    	JsrStation jsrstation = new JsrStation();
    	BlrStation blrstation = new BlrStation();
    	RncStation rncstation = new RncStation();
    	weatherdata.add(blrstation);
    	weatherdata.add(jsrstation);
    	weatherdata.add(rncstation);
    	weatherdata.setVal(60);
    	weatherdata.setVal(70);
    	System.out.println("-----------------");
    	
    	//observer design
    	
    }
}
