package com.revature.scanner;

import java.util.Scanner;

public class Calculator {
	
	//static so that theres only one
	private static Scanner sc = new Scanner(System.in); //import Scanner from util
	
	public void calculate() {
		System.out.println("Please enter the operation you'd like to perform");
		String operation = sc.nextLine();
		//switch statements for operation choices
		int nums[] = new int[2];
		int result = 0;
		
		switch(operation)
		{
		case "addition":
			//get and add variables
			nums = getNums();
			result = nums[0] + nums[1];
			break;
		case "subtraction":
			nums = getNums();
			result = nums[0] - nums[1];
			break;
		case "division":
			nums = getNums();
			while(nums[1] == 0)
			{
				System.out.println("Cannot divide by 0, please enter valid operands");
				nums = getNums();
			} //while loop
			break;
		case "multiplication":
			nums = getNums();
			result = nums[0] * nums[1];
			break;
		default:
			System.out.println("Invalid operation");
			calculate();	//recursion
		}
		
		System.out.println("Your result is: "+ result);
	} //Calculate()
	
	private int[] getNums() 
	{
		int nums[] = new int[2];
		System.out.println("Please enter first number: ");
		nums[0] = getNum();
		System.out.println("Please enter second number: ");
		nums[1] = getNum();
		return nums;
	}
	
	private int getNum() 
	{
		int num;
		try {
			num = Integer.parseInt(sc.nextLine());
			return num;
		} catch(NumberFormatException e) {
			System.out.println("Invalid input. Please enter an integer");
			return getNum();
		}
	}
	
	
} //Calculator class
