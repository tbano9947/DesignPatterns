package com.conestoga.designPatttern;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.conestoga.designPatttern.factory.Car;
import com.conestoga.designPatttern.factory.CarFactory;
import com.conestoga.designPatttern.factory.FactoryImplementation;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void getCarObject() {
    	CarFactory cf = new CarFactory();
    	Car car = cf.getCarObject("innova");
    	assertTrue(true);
    }
}
