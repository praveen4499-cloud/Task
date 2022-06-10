package com.vasypro.ThirdExercise;

public class CarMain {
	public static void main(String[]arts)
	{
		Car c= new Car("bbb", "aaa", "ccc");
		System.out.println(c.hashCode());
		System.out.println(c);
		c.setModel("bmw");
		c.setRegNumber("aaa1234");
		c.setTime("12.12");
		System.out.println("REGISTERATION "+c.getRegNumber());
		System.out.println("MODEL "+c.getModel());
		System.out.println("TIME "+c.getTime());
		Car c1= new Car("zzzz", "aaa", "ccc");
		System.out.println(c1);
		
		Car c3= new Car();
		System.out.println(c3);
		System.out.println(c1.getCount()); 
		
	}

}
