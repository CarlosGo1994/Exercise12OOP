package com.exercise12oop.model;

import java.lang.Math;

public class Circle extends Shape{
	
	//Characteristics
	private double radio;
	
	public Circle()
	{
		
	}
	
	public Circle(double radio)
	{
		this.radio=radio;	
	}
	
	//////////////////
	public double CalculateArea(double radio)
	{
		return Math.PI * Math.pow(radio,2);
		
	}

	public double CalculatePerimeter(double radio)
	{
		return 2*Math.PI*radio;
		
	}

	//Getters and Setters
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}

	@Override
	public void DoSomething() {
		// TODO Auto-generated method stub
		
	}
	
	
}
