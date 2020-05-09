package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	public static Properties prop;
	/**
	 * This method will read properties file
	 * @param filePath
	 */
	public static void readProperties(String filePath) {
		try {
			FileInputStream fis=new FileInputStream(filePath);
			Properties prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method will return value of specified key
	 * @param key
	 * @return
	 */
	
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
