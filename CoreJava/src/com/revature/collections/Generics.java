package com.revature.collections;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
	/*	//generics and why we use them
		//use as a placeholder to parameterize type
		ArrayList<E> arrList = new ArrayList();
		//like this above, error will say "ArrList is a raw type. References to 
		//generic type ArrayList<T> should be parameterized"
		
		arrList.add("test");
		Integer i = (Integer) arrList.get(0);					*/
		
		//Now we've declared the generic type
		ArrayList<String> strArrList = new ArrayList<String>();
		strArrList.add("test");
		strArrList.get(0);
		
		Integer[] iArr = {1, 2, 3, 4};
		printMe(iArr);
		
		Character[] cArr = {'h', 'e', 'l', 'l', 'o'};
		printMe(cArr);
	}
	/*
	//overloading
	public static void printMe(Integer[] arr) {
		for(Integer i: arr)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	
	//overloading
	public static void printMe(Character[] arr)
	{
		for(Character i: arr)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	*/
	
	//Generic function that will do same as the two printMes
	public static <T> void printMe(T[] arr)
	{	
		for(T i: arr) {
			System.out.print(i);
		}
		System.out.println();
	}

	
	
	
	
	
	
}
