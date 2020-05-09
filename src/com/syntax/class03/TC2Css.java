package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2Css {
	
	public static String url="http://newtours.demoaut.com/";
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("a[href*='register']")).click();
		driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Hugh");
		driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Jackman");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("2340984578");
		driver.findElement(By.cssSelector("input[name$='rName']")).sendKeys("hughie@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("123 Wolverine Lane");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Loganville");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("Virginia");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("22304");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Hughie123");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("HotCrossBuns");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("HotCrossBuns");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		
		
		
	}

}
