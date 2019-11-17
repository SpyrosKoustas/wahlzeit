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


public class CartesianCoordinate implements Coordinate {
    
    private double x;
    private double y;
    private double z;
    
    public CartesianCoordinate (double _x, double _y, double _z) {        
        this.x = _x;
        this.y = _y;
        this.z = _z;        
    }
    
    public CartesianCoordinate asCartesianCoordinate() {
        return this;
    }
    
    public SphericCoordinate asSphericCoordinate () {
        double r = Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2);
        return new SphericCoordinate(Math.atan(this.y/this.x), Math.acos(this.z/r), r,2);
    }
    
    public void setCartesianCoordinates (double _x, double _y, double _z){
        this.x = _x;
        this.y = _y;
        this.z = _z;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getZ() {
        return this.z;
    }
    
    public double getCartesianDistance (Coordinate crdnt) {
        double distance = Math.sqrt(Math.pow(Math.round(crdnt.getX()) - Math.round(this.x), 2) + Math.pow(Math.round(crdnt.getY()) - Math.round(this.y), 2) + Math.pow(Math.round(crdnt.getZ()) - Math.round(this.z), 2));
        return distance;
    }
        
    public boolean isEqual (Coordinate crdnt) {
        if (getCartesianDistance(crdnt) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
