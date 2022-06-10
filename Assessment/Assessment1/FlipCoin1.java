package com.java.model;

import java.util.Scanner;

public class FlipCoin1 {
	public static void main(String[]args)
	{
		

	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of flip");
	flip(sc.nextInt());
	
	}
	public static void flip(int coin)
	{
		for(int i=0;i<coin;i++)
		{
	if(Math.random()< 0.5)
	{
		System.out.println("heads");
		
	}
	else
	{
		System.out.println("tails");
		
	}
		}
	

}
}
