package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
	
	public static void main(String[] args) {
//		TC 2: Syntax Page URL Verification: 
//			Open chrome browser
//			Navigate to “https://www.zillow.com/”
//			Navigate to “https://www.google.com/”
//			Navigate back to Zillow Page
//			Refresh current page
//			Verify url contains “Zillow”
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zillow.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		String url=driver.getCurrentUrl();
		
		if(url.contains("zillow")) {
			System.out.println("URL contains zillow");
		}
		else {
			System.out.println("URL does not contain zillow");
		}

	}

}
