package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDriver {

	//file input stream and object input stream
	public static void main(String[] args) {
		
		//if you put the clauses to be tried up front, then you don't have to close the files
		//it will handle those resources for you
//		try (FileInputStream fis = new FileInputStream("./Cereal.ser"); ObjectInputStream ois = new ObjectInputStream(fis); ){
//			Cereal c = (Cereal) ois.readObject(); //"ClassNotFoudnE
//			System.out.println(c);			
//		}
		try {
			FileInputStream fis = new FileInputStream("./Cereal.ser"); //FileNotFoundE
			ObjectInputStream ois = new ObjectInputStream(fis); //IOException
			
			Cereal c = (Cereal) ois.readObject(); //"ClassNotFoudnE
			System.out.println(c);
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
