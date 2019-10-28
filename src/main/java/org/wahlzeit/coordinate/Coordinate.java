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
public class Coordinate {
    
    private double x;
    private double y;
    private double z;
    
    public Coordinate (double _x, double _y, double _z) {        
        this.x = _x;
        this.y = _y;
        this.z = _z;        
    }
    
    public void setCoordinates (double _x, double _y, double _z){
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
    
    public double getDistance (Coordinate crdnt) {
        double distance = Math.sqrt(Math.pow(crdnt.getX() - this.x, 2) + Math.pow(crdnt.getY() - this.y, 2) + Math.pow(crdnt.getZ() - this.z, 2));
        return distance;
    }
    
    public boolean isEqual (Coordinate crdnt) {
        if (getDistance(crdnt) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
