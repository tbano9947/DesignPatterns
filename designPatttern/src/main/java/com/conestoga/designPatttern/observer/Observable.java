package com.conestoga.designPatttern.observer;

public interface Observable {
 public void add(Observer observer);
 public void remove(Observer observer);
 public void notifyOb();
void setVal(float temp);
}
