package com.conestoga.designPatttern.observer;

public class JsrStation implements Observer{

	@Override
	public void update(float temp) {
		// TODO Auto-generated method stub
		System.out.println("current tmp in jsr is "+temp);
		
	}

}
