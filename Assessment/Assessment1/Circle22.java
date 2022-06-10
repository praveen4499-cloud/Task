package com.java.model;

public class Circle22 {
	int radius1;
	int radius2;
	double area;
	public static final double pi=3.142;
	public Circle22()
	{
		
	}
	public Circle22(int radius1,int radius2)
	{
		this.radius1=radius1;
		this.radius2=radius2;
	}
	public double getAreas1()
	{
		 return area=pi*radius1*radius2;
	}
	public String printInfo()
	{
		return"AREA OF CIRCLE: " +area +"\n" + "RADIUS OF first CIRCLE is: "+radius1 + "RADIUS OF first CIRCLE is: "+radius1       ;
		
	}

}
