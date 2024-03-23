package com.ian.shape_hierarchy;

/**
 *
 * @author Ian Tagano
 */


public class Circle extends Shape
{
    //private attributes
    private double  radius;
    
    
    //constructor
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    
    //methods 
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}
