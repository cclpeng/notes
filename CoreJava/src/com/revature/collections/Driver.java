package com.revature.collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		//playing around with more collections
		//LinkedHash Set
		LinkedHashSet<Integer> hSet = new LinkedHashSet<Integer>();
		hSet.add(6);
//		hSet.add(6);			Sets can't have duplicates. will be removed. 
		hSet.add(2);
		hSet.add(3);
		hSet.add(4);
		hSet.add(6);			//no error but wont be added
		System.out.println(hSet);
		
		
		//Tree Set
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(6);
//		tSet.add(6);			Sets can't have duplicates
		tSet.add(2);
		tSet.add(3);
		tSet.add(4);
		tSet.add(6);
		System.out.println(tSet);		//Sorts for us
		
		TreeSet<String> sSet = new TreeSet<String>();
		sSet.add("charlie");
		sSet.add("brownie");
		System.out.println(sSet);       //
		
		
	}
	

}
