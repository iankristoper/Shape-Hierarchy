package com.ian.shape_hierarchy;

/**
 *
 * @author Ian Tagano
 */


public class Rectangle extends Shape
{
    //private attributes 
    private double length;
    private double width;
    
    
    //constructor 
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    
    @Override 
    public double getArea()
    {
        return length * width;
    }
    
    @Override 
    public double getPerimeter()
    {
        return 2 * (length + width);
    }
}
