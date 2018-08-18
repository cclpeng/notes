package com.revature.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) {
		Cereal c = new Cereal(true, 150, 20, "Lucky Charms");
		//object rdy to be serialized
		
		try {
			FileOutputStream fos = new FileOutputStream("./Cereal.ser"); //put the new serialization file
			//in the same directory
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
			fos.close();
			System.out.println("We're done cereal-lizing");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
