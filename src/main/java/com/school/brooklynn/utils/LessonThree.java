package com.school.brooklynn.utils;

public class LessonThree {
	
	public int math1(int x, int y) {
		int z = 0;
		System.out.println(x);
		while(x < y) {
			//Increment value of z
			z=z+123;
			
			//Increment value of x
			x++;
			System.out.println("x=" + x + " : z="+z);
			
		}
		
		return z;
	}
	
	public int math2(int x) {
		int z = 0;
		
		for(int i = 0; i< 8; i++) {
			z +=x;
		}
		
		return z;
	}
	
	
	public static void main(String args[]) {
		System.out.println("Start Lesson Two");
		LessonThree lessonTwo = new LessonThree();
		
		int x = lessonTwo.math1(1, 21);
		System.out.println("math 1= " + x);
		
		System.out.println("math 2= " + lessonTwo.math2(3));
	}

}
