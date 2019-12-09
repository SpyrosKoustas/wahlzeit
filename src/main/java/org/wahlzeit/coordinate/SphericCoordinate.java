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
public class SphericCoordinate extends AbstractCoordinate {
    
    public SphericCoordinate (double _phi, double _theta, double _radius) {        
        super(_phi, _theta, _radius);       
    }
    
    public CartesianCoordinate asCartesianCoordinate() {
        return new CartesianCoordinate(this.getAttr3()*Math.sin(this.getAttr2())*Math.cos(this.getAttr1()), this.getAttr3()*Math.sin(this.getAttr2())*Math.sin(this.getAttr1()), this.getAttr3()*Math.cos(this.getAttr2()));
    }
    
    public SphericCoordinate asSphericCoordinate () {
        return this;
    }
    
    public double getCartesianDistance (Coordinate crdnt) {
        return asCartesianCoordinate().getCartesianDistance(crdnt);
    }
    
    //I used the haversine fomula to calculate the central angle
    //source: https://en.wikipedia.org/wiki/Haversine_formula
    
    public double getCentralAngle(SphericCoordinate crdnt) {
        double centralAngle = 0;
        
        double dLat = Math.toRadians(crdnt.getAttr1() - this.getAttr1());
        double dLon = Math.toRadians(crdnt.getAttr2() - this.getAttr2());
        double lattitude1 = Math.toRadians(crdnt.getAttr1());
        double lattitude2 = Math.toRadians(crdnt.getAttr2());

        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLon / 2), 2) * Math.cos(lattitude1) * Math.cos(lattitude2);
        centralAngle = 2 * Math.asin(Math.sqrt(a));
        
        return centralAngle;
    }
    
    public boolean isEqual (Coordinate crdnt) {
        if (asCartesianCoordinate().getCartesianDistance(crdnt) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    //include assert();    
}
