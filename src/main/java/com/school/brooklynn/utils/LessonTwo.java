package com.school.brooklynn.utils;

public class LessonTwo {
	
	public int math1(int x) {
		int z = 0;
		if(x >= 15) {
			z = 1;
		}
		
		return z;
	}
	
	public int math2(int x,int y) {
		int z = 0;
		
		if (x<y) {
			z = x + y;
		}else {
			z = x * y;
		}
		
		return z;
	}
	
	
	/***
	 * Build a method named "testMe" that will return an double
	 * ** take 3 integer parameters (x,y,z)
	 * ** Create a "if else" condition to check if x+y is less than z.
	 * ** If x+y is greater than z return x+y else return z 
	 * ** return the value of equation to calling system.
	 * ***/
	
	
	public static void main(String args[]) {
		System.out.println("Start Lesson Two");
		LessonTwo lessonTwo = new LessonTwo();
		
		//System.out.println("checkResults = " +lessonTwo.testMe(?,?,?));
	}

}
