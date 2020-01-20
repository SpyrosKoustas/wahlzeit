/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wahlzeit.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author spyros
 */
public class CarType {
    
    public CarManager carManager = null;
    public CarType superCarType = null;
    public Set<CarType> subCarType = new HashSet<CarType>();
    
    private String carTypeName = null;
    
    public CarType(CarManager cm, String typeName) {
        carManager = cm;
        carTypeName = typeName;
    }
    
    public Car createInstance() {
        return new Car(carManager, this);
    }
    
    public String getCarTypeName() {
        return carTypeName;
    }
    
    public CarType getSuperCarType() {
        return superCarType;
    }
    
    public boolean isSubType() {
        if(superCarType != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public Iterator<CarType> getSubTypeIterator() {
        return subCarType.iterator();
    }
    
    public void addSubType(CarType ct) {
        assert (ct != null) : "Subtype should not be null!";
        subCarType.add(ct);
    }
    
    public boolean hasInstance(Car beepbeep) {
        assert (beepbeep != null) : "Beep-beep (car) should not be null!";
        
        if(beepbeep.getCarType() == this) {
            return true;
        }
        
        for(CarType type : subCarType) {
            if(type.hasInstance(beepbeep)) {
                return true;
            }
        }
        
        return false;
    }
}
