package com.revature.types;

public class DefaultDriver {
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static String str;
	static boolean[] arr = new boolean[4];
	
	public static void main(String[] args)
	{
		//"sysout" + ctrl+space
		//wat would u see if u print out all these variables? on ln 4-9
		System.out.println("Bool: "+ bool);
		System.out.println("By: "+ by);
		System.out.println("Ch: "+ ch);
		System.out.println("Double: "+ d);
		System.out.println("String: "+ str);
		System.out.println("Arr: "+ arr[0]);
		
//		int x;
//		System.out.println(x); 
		//can not use non static and print, wont compile
		
	}
}
