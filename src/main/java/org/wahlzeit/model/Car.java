/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wahlzeit.model;

/**
 *
 * @author spyros
 */
public class Car {
   
    protected CarManager carManager =  null;
    protected CarType carType = null;
    
    public Car (CarManager cm, CarType ct) {
        carManager = cm;
        carType = ct;    
    }
    
    public CarManager getCarManager() {
        return carManager;
    }
    
    public CarType getCarType() {
        return carType;
    }
}
