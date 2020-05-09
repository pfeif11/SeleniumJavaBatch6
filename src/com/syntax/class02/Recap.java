package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
