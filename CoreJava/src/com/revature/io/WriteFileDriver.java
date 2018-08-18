package com.revature.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/com/revature/io/data.txt";
		String content = "\nGreetings";
		BufferedWriter bw = null;
		
		try {
			//specify the file we want to write to
			File file = new File(path);
			
			//checking first to see if the file exists, create if it doesnt
			if(!file.exists()) {			//CREATES THE FILE. REMEMBER TO REFRESH the PROJECT
				file.createNewFile();		//right click and refresh
			}
			
			//if u just do FileWriter(name)  defaults to False and Overwrites
			//if u do FileWriter(name, true) turns flag on and Appends
			FileWriter fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			
			bw.write(content);
			System.out.println("Our file has been written");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {			//finally means no matter what try or catch, then do this at the end
			try {
				bw.close();					//surround w try/catch
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

} 
