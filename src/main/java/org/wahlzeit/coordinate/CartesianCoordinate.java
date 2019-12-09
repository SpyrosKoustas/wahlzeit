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


public class CartesianCoordinate extends AbstractCoordinate {
    
    public CartesianCoordinate (double _x, double _y, double _z) {        
        super(_x, _y, _z);        
    }
    
    public CartesianCoordinate asCartesianCoordinate() {
        return this;
    }
    
    public double getCartesianDistance (Coordinate crdnt) {
        double distance = Math.sqrt(Math.pow(crdnt.getAttr1() - this.getAttr1(), 2) + Math.pow(crdnt.getAttr2() - this.getAttr2(), 2) + Math.pow(crdnt.getAttr3() - this.getAttr3(), 2));
        return distance;
    }
    
    public SphericCoordinate asSphericCoordinate () {        
        double r = Math.pow(this.getAttr1(), 2) + Math.pow(this.getAttr2(), 2) + Math.pow(this.getAttr3(), 2);
        return new SphericCoordinate(Math.atan(this.getAttr2()/this.getAttr1()), Math.acos(this.getAttr3()/r), r);
    }
    
    public boolean myCompare (double f1, double f2) {
        final double THRESHOLD = .0001;
                
        for (int i =1; i <= 11; i++) {
            f1 += .1;
            f2 += .1;
        }
        
        if (Math.abs(f1 - f2) < THRESHOLD) {
            return true;
        } else {
            return false;
        }
    }
        
    public boolean isEqual (Coordinate crdnt) {
        if (myCompare(crdnt.getAttr1(), this.getAttr1()) && myCompare(crdnt.getAttr2(), this.getAttr2()) && myCompare(crdnt.getAttr3(), this.getAttr3())) {
            return true;
        } else {
            return false;
        }
    }
    
    // include assert();
}
