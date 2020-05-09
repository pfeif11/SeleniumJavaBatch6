package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
//	Using xPath ONLY
//	TC 2: Mercury Tours Registration: 
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info (skip dropdowns)
	public static String url="http://newtours.demoaut.com/";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Tina");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Turner");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("5553094039");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tinaturner@gmal.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123 Hollywood Way");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Hollywood");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("California");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("90210");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tinaturner1234");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("TT12345");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("TT1234");
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}

}
