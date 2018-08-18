package com.revature.strings;

import java.util.Vector;

public class StringDriver {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		String s = "ha";
		int j = 4;
		v.add(s);
		v.add(j);
		
		String string1 = "I'm a string!";
		String string2 = "I'm a string!";
		
		//strings have the same value as well as the same reference
		System.out.println("Objects are equal: " + string1.equals(string2));
		System.out.println("Objects are == : " + (string1 == string2));  //same because string pool
								//location is the same
		System.out.println("String1 hashcode(unique identifier related to mem location): "+ string1.hashCode());
		System.out.println("String2 hashcode: " + string2.hashCode());
		
		String alsoString1 = string1;	//copy so we can change string1
		string1 = string1 + "!";		//strings are immutable, so the "+" makes a NEW STRING in pool
		System.out.println(string1);
		System.out.println(alsoString1);
		System.out.println("String1 hashcode: " + string1.hashCode());
		System.out.println("alsoString1 hashcode: " + alsoString1.hashCode());
		
		System.out.println("String1 is equal to alsoString1: " + string1.equals(alsoString1));
		System.out.println("string1 is == to alsoString1: " + string1 == alsoString1);
		
		
		
//========================================================================================
		
		//now mutable strings
		//StringBuilder
		StringBuilder stringBuilder1 = new StringBuilder("I'm a string builder object!");
		StringBuilder stringBuilder2 = new StringBuilder("I'm a string builder object!");
		//now we get their hashcodes to see if its the same
		System.out.println(stringBuilder1.hashCode());
		System.out.println(stringBuilder2.hashCode());
		System.out.println(stringBuilder1.toString().equals(stringBuilder2.toString()));
				//need toString() for stringbuilder otherw equals() dont work ^
		//if converted to strings from stringbuilder, would again pt to same place in pool. == true
		System.out.println("stringBuilder1.toString hashcode: " + stringBuilder1.hashCode());
		System.out.println("stringBuilder2.toString hashcode: " + stringBuilder2.hashCode());
		
		//modify a StringBuilder's value
		StringBuilder alsoStringBuilder1 = stringBuilder1;
		System.out.println("stringBuilder1: " + stringBuilder1);
		System.out.println("hashcode before mutation: " + stringBuilder1.hashCode());
		System.out.println("alsoStringBuilder1: " + alsoStringBuilder1);
		stringBuilder1.append("!");
		System.out.println("hashcode after mutation: " + stringBuilder1.hashCode());
		System.out.println("same hashcodes because despite change, same object");
		
		System.out.println("stringBuilder1: " + stringBuilder1);
		System.out.println("alsoStringBuilder1: " + alsoStringBuilder1); //Though no change done,
							//points to the same place as stringBuilder1
		System.out.println("hashcode of alsoSB: "+ alsoStringBuilder1.hashCode());
		
		
		
	}

}
