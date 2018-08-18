package com.revature.types;

public class AutoBoxing {

	public static void main(String[] args) {
		int num1 = 5;
		Integer num2 = new Integer(num1);	//Boxing = we box prim value
		
		//unboxing...
		Integer num3 = new Integer(3);
		int num4 = num3.intValue();
		
		//autoboxing. dont have to do what is on ln 9-11, java auto unboxes for us
		//autoboxing
		int n5 = 12;
		Integer n6 = n5;			//java is converting between a class and a primitive
		
		//auto unboxing
		int n7 = new Integer(10);
		int n8 = n7;			

	}

}
