/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wahlzeit.coordinate;
import java.lang.Math;

/**
 *
 * @author spyros
 */
abstract class AbstractCoordinate {
    
    private double attr1;
    private double attr2;
    private double attr3;
    
    public AbstractCoordinate (double _attr1, double _attr2, double _attr3) {
     this.attr1 = _attr1;
     this.attr2 = _attr2;
     this.attr3 = _attr3;
    }
    
    public double getAttr1() {
        return this.attr1;
    }
    
    public double getAttr2() {
        return this.attr2;
    }
    
    public double getAttr3() {
        return this.attr3;
    }
    
    public void setCoordinates (double _attr1, double _attr2, double _attr3){
        this.attr1 = _attr1;
        this.attr2 = _attr2;
        this.attr3 = _attr3;
    }
}