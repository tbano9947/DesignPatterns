package com.conestoga.designPatttern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{
	private float temp;
	List<Observer> myList; 
	public WeatherData()
	{
		myList = new ArrayList<Observer>();
	
	}
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		myList.add(observer);
		
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		myList.remove(observer);
		
	}

	@Override
	public void notifyOb() {
		// TODO Auto-generated method stub
		for(Observer obj:myList)
		{
			obj.update(temp);
		}
	}
	@Override
	public void setVal(float temp) {
		// TODO Auto-generated method stub
		this.temp=temp;
		notifyOb();
		
	}

}
