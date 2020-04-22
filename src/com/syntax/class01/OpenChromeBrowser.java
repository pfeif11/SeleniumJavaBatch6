package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromeDriver(); -- not using best practices, because it you need to change it to Firefox, you need to change both sides
		//WebDriver is an interface
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://www.facebook.com")) {
			System.out.println(driver.getTitle());
		}
		else {
			System.out.println("Wrong url is returned");
		}
		Thread.sleep(2000); // adds 2 seconds between 
		driver.close();
		
	}

}
