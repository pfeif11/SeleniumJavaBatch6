package com.syntax.utils;

public class Constants {
	
	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";

	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";

	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"\\configs\\configuration.properties";
	
	//public static final
	
	public static void main(String[] args) {
		System.out.println(CHROME_DRIVER_PATH);
	}

}
