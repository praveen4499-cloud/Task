package com.java.model;

public class Rectangle1 {
	double area;
	
	int b;
	int h;

	public Rectangle1(int b,int h) {
		
		this.b=b;
		this.h=h;
		
	}
	public double calclate()
	{
		area =(b*h)/2;
		return area;
		
	}
	
	
	public void display()
	{
		System.out.println(area);
	}

}
