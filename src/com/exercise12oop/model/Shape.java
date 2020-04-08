package com.exercise12oop.model;

public abstract class Shape implements Shapeable, Lineable
{

	@Override
	public String Draw() {
		return "Figure is being drawn";
		
	}

	@Override
	public String ChangeColor() {
		
		return "Figure is being changed its color";
	}

	@Override
	public String Erase() {
		return "Figure is being erased";
	}

	@Override
	public double CalculateArea() {
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		return 0;
	}

}
