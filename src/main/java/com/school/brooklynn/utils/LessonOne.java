package com.school.brooklynn.utils;

public class LessonOne {
	
	public int math1(int x, int y) {
		
		return x + y;
	}
	
	public String string1(String start, String end) {
		
		return start + " " + end;
	}
	
	
	public double double1(double x, double y) {
		
		return x + y;
	}
	
	//Build Method to multiple 2 integers
	
	public int butpoop(int b, int p) {
		return b*p;
	}
	
	public double poopbut(double b, double p) {
		return p*b;
	}
	
	public String bbutt (String ff, String dd, int vv) {
		return ff + " " + dd + " " + vv;
	}
	
	
	/***
	 * Build a method named mathTest1 that will return a double
	 * ** take an integer parameter called "x" and a double parameter called "y" 
	 * ** Create the following equation: (x+y) * y 
	 * ** return the value of equation to calling system.
	 * ***/
	
	public double mathTest1 (int x, double y) {
	  return (x+y) * y;
	}
	
	public static void main(String args[]) {
		System.out.println("Start Lesson One");
		LessonOne lessonOne = new LessonOne();
		

		
		System.out.println(lessonOne.bbutt("the","Brooklynn is",8));

		System.out.println(lessonOne.mathTest1(26 , 36.6 ));
	}

}
