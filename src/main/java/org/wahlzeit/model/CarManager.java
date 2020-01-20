l/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wahlzeit.model;


import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author spyros
 */
public class CarManager {
    
    public Set<CarType> types = new HashSet<CarType>();
    public Set<Car> cars = new HashSet<Car>();
    
    public Car createCar(String carTypeName) {
        CarType ct = getCar(carTypeName);
        Car result = ct.createInstance();
        cars.add(result);
        return result;
    }
    
    public CarType getCarType(String carTypeName) {
        for(CarType savedType : types) {
            if(savedType.getCarTypeName().equals(carTypeName)) {
                return savedType;
            }
        }
        
        CarType savedCar = new CarType(this, carTypeName);
        types.add(savedCar);
        return savedCar;
    }
    
}
