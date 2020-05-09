package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1HRMSLogin {
//	TC 1: HRMS Application Login: 
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//		Enter valid username and password
//		Click on login button
//		Then verify Syntax Logo is displayed.
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[name='Submit']")).click();
		boolean displayed=driver.findElement(By.cssSelector("img[src*='/syntax.png']")).isDisplayed();
		System.out.println(displayed);
		
		
	}


}
