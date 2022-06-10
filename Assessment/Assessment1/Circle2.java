package com.java.model;

public class Circle2 {
	int radius;
	double area;
	public static final double pi=3.142;
	public Circle2()
	{
		
	}
	public Circle2(int radius)
	{
		this.radius=radius;
	}
	public double getAreas()
	{
		 return area=pi*radius*radius;
	}
	public String printInfo()
	{
		return"AREA OF CIRCLE: " +area +"\n" + "RADIUS OF CIRCLE is: "+radius;
		
	}

}
