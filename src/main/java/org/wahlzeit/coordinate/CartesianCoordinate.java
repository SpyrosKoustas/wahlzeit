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
        double distance = Math.sqrt(Math.pow(Math.round(crdnt.getAttr1()) - Math.round(this.getAttr1()), 2) + Math.pow(Math.round(crdnt.getAttr2()) - Math.round(this.getAttr2()), 2) + Math.pow(Math.round(crdnt.getAttr3()) - Math.round(this.getAttr3()), 2));
        return distance;
    }
    
    public SphericCoordinate asSphericCoordinate () {        
        double r = Math.pow(this.getAttr1(), 2) + Math.pow(this.getAttr2(), 2) + Math.pow(this.getAttr3(), 2);
        return new SphericCoordinate(Math.atan(this.getAttr2()/this.getAttr1()), Math.acos(this.getAttr3()/r), r);
    }
        
    public boolean isEqual (Coordinate crdnt) {
        if (getCartesianDistance(crdnt) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
