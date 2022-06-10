package com.java.model;

public class CircleTest
{
	

	public static void main(String[]args)
	{
	    double sum1=0,sum2=0;
		int arr[]=new int[100];
		int arr1[]=new int[100];
		for(int i=0;i < arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
			arr1[i]=(int)(Math.random()*10);
			
				Circle2 c2=new Circle2(arr[i]);
				Circle22 c22=new Circle22(arr[i],arr1[i]);
				
				sum1= sum1 + c2.getAreas();
				sum2=sum2+c22.getAreas1();
				//System.out.println(i+"circle is");
				
				
			
		}
		System.out.println("first circle");
		System.out.println(sum1);
		System.out.println("second circle");
		System.out.println(sum2);
		
	
		
		
		
	}

}
