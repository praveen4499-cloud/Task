package com.java.model;

public class Square extends Rectangle1{
	
			public Square(int b,int h) {
		
				
				super(b,h);
		// TODO Auto-generated constructor stub
	}

			public static void main(String[] args) {
				Square s= new Square(8,134);
				
				s.calclate();
		        s.display();
	
			}
}
