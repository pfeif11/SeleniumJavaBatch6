package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equalsIgnoreCase("https://www.redfin.com/")) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Wrong url is returned");
		}
		
		driver.close();
		
	}

}
