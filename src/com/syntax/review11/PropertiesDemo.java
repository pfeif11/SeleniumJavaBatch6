package com.syntax.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
	
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		String filePath=System.getProperty("user.dir")+"\\testdata\\extra.properties";
		System.out.println(filePath);
		
		FileInputStream fileIS=new FileInputStream(filePath);
		
		Properties proper=new Properties();
		proper.load(fileIS);
		
		System.out.println(proper);
		//1st way:get as an object and downcast into a String
		//String lastname=(String)proper.getProperty("LastName");
		//2nd way. Get the value as a String
		String lastName=proper.getProperty("LastName");
		System.out.println("Last Name --> "+lastName);
		String firstName=proper.getProperty("FirstName");
		System.out.println("First Name --> "+firstName);
		
		//1st way, use getProperty to get age as a String
		String age=proper.getProperty("Age");
		//2nd way, us get method to get age as an Object
		String age2=(String)proper.get("Age");
		System.out.println(age);
		System.out.println(age2);
		
		//add more key value pairs
		proper.setProperty("StudentNumber","123");
		System.out.println(proper);
		
		//or we can reassign
		proper.setProperty("FirstName", "Mike");
		System.out.println(proper);
		
		//let's write into the properties file
		FileOutputStream fileOS=new FileOutputStream(filePath);
		proper.store(fileOS, "hi there");
		
		System.out.println("Done");
		
	}

}
