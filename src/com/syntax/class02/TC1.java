package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	public static void main(String[] args) {
//		TC 1: Facebook sign up: 
//			Open chrome browser
//			Go to “https://www.facebook.com/”
//			Enter first name
//			Enter last name
//			Enter mobile number
//			Click on sign up button
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("u_0_m")).sendKeys("Tina");
		
		driver.findElement(By.id("u_0_o")).sendKeys("Pfeifer");
		
		driver.findElement(By.id("u_0_r")).sendKeys("7037777777");
		
		driver.findElement(By.id("u_0_13")).click();
		
	}

}
