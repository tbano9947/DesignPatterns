package com.conestoga.designPatttern.observer;

public class BlrStation implements Observer{

	@Override
	public void update(float temp) {
		// TODO Auto-generated method stub
		System.out.println("current tmp in blr is "+temp);
		
	}

}
