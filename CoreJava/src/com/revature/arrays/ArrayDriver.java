package com.revature.arrays;

import java.util.Arrays;

public class ArrayDriver {
	public static void main(String[] args) {
		//1D array
		int[] intArray1 = new int[5];   //[00000]    <===Preferred method in java
		int intArray2[] = new int[5];
		int[] intArray3 = {1, 2, 7, 9};
		
		System.out.println(intArray3[0]);
		System.out.println(intArray3[3]);
//		System.out.println(intArray3[10]);	//what happens if out of bounds? 
									//Compiles fine. Get an exception thrown at run time
								//ArrayIndexOutOfBoundsException
		//can look up from the Utils library line 3 (didnt have to add that line(java added for me))
		System.out.println(Arrays.toString(intArray3));   //Arrays.toString() from utils array class
		
		
		
		//2D array
		int[][] int2Darray = new int[3][4];
		int[][] int2Darray2 = {{2}, {3, 4}, {2,1,}, {0,3,2,7}};
		//looping thru
		for(int i = 0; i < int2Darray2.length; i++)	 					//arr[i].length
		{
			for(int j = 0; j < int2Darray2[i].length; j++)     //<=====NEW :O to get length of inner arr
				System.out.print(int2Darray2[i][j] + " ");
			System.out.println();
		}
		System.out.println();
				
		//foreach loop version
		for(int[] i: int2Darray2)
		{
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
