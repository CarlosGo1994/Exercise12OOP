package com.exercise12oop.app;


import com.exercise12oop.model.Square;
import com.exercise12oop.model.Triangle;
import com.exercise12oop.model.Circle;
import com.exercise12oop.model.Shape;

import java.util.Scanner;



public class ShapeApp 
{

	public static void main(String[] args) 
	{
		
		double radio=0;
		
		Square square1 = new Square();
		Circle circle1= new Circle();
		Triangle triangle1 = new Triangle();
		
		Shape miForma;
		miForma = new Triangle();
		miForma = new Circle();
		
		Square square2 = new Square(10.2);
		Circle circle2 = new Circle(5.3);
		Triangle triangle2 = new Triangle(5.4,6.8);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the radio of the circle:");
		circle1.setRadio (input.nextDouble());
		
		//circle1.setRadio(radio);
		
		System.out.println("The area of the circle:"+circle1.CalculateArea(circle1.getRadio()));
		
		//System.out.println(circle2.CalculatePerimeter(circle2.getRadio()));
		
		input.close();
	}

}
