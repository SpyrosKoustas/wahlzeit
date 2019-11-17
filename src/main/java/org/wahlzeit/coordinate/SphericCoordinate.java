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
public class SphericCoordinate {
    
    private double phi;
    private double theta;
    private double radius;
    
    public SphericCoordinate (double _phi, double _theta, double _radius) {        
        this.phi = _phi;
        this.theta = _theta;
        this.radius = _radius;        
    }
    
    public CartesianCoordinate asCartesianCoordinate() {
        return new CartesianCoordinate(this.radius*Math.sin(this.theta)*Math.cos(this.phi), this.radius*Math.sin(this.theta)*Math.sin(this.phi), this.radius*Math.cos(this.theta));
    }
    
    public SphericCoordinate asSphericCoordinate () {
        return this;
    }
    
    public void setSphericCoordinate (double _phi, double _theta, double _radius) {        
        this.phi = _phi;
        this.theta = _theta;
        this.radius = _radius;        
    }
    
    public double getPhi() {
        return this.phi;
    }
    
    public double getTheta() {
        return this.theta;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double getCartesianDistance (Coordinate crdnt) {
        return asCartesianCoordinate().getCartesianDistance(crdnt);
    }
    
    //I am not exactly sure what to return here...
    public double getCentralAngle(SphericCoordinate crdnt) {
        double centralAngle = 0;
        return centralAngle;
    }
    
    public boolean isEqual (Coordinate crdnt) {
        if (asCartesianCoordinate().getCartesianDistance(crdnt) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
