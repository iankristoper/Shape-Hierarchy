package com.ian.shape_hierarchy;


/**
 *
 * @author Ian Tagano
 */


public class Shape_Hierarchy 
{

    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,6);
        Triangle triangle = new Triangle(4,5,6);
        
        System.out.println("Circle: ");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        
        System.out.println("Rectangle: ");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        
        System.out.println("Triangle: ");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
         
    }
}
