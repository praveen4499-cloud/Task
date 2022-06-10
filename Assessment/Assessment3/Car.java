package com.vasypro.ThirdExercise;

import java.util.Objects;

public class Car {
	String regNumber;
	String Model;
	String time;
	static int count;
	public Car()
	{
		regNumber="Aer1456";
		Model="audi";
		time="10.20pm";
		count++;
	}
public Car(String regNumber, String Model, String time) {
	
	this.regNumber = regNumber;
	this.Model = Model;
	this.time = time;
	count++;
}
public String getRegNumber() {
	return regNumber;
}
public void setRegNumber(String regNumber) {
	this.regNumber = regNumber;
	
}
public String getModel() {
	return Model;
	}
public void setModel(String Model) {
	this.Model = Model;
	
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
@Override

public int hashCode() {
	return Objects.hash(Model, regNumber, time);
	
}
@Override
public String toString() {
	
	return "Car [regNumber=" + regNumber + ", Model=" + Model + ", time=" + time + "]";
}
@Override
public boolean equals(Object obj) {
	
	return (boolean)obj;
}
public static String getCount()

{
	return "number of method " + count;
	
}
}