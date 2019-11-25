/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wahlzeit.coordinate;


/**
 *
 * @author spyros
 */

//Interface
public interface Coordinate {
    public double getAttr1();
    public double getAttr2();
    public double getAttr3();
    public CartesianCoordinate asCartesianCoordinate();
    public double getCartesianDistance(Coordinate crdnt);
    public SphericCoordinate asSphericCoordinate();
    public double getCentralAngle(Coordinate crdnt);
    public boolean isEqual(Coordinate crdnt);
}