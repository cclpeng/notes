package com.revature.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/com/revature/io/read_data.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path)); //surround w try/cath
			String line = br.readLine();
					
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			
			br.close();
			
		} catch (/*FileNotFoundException | */IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
