package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3HRMSJiraVM {
	
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
//	TC 3: Syntax Demo input boxes count: 
//		Open chrome browser
//		Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		Click on “Input Forms” links
//		Click on “Simple Form Demo” links
//		Get all input boxes from the page
//		Enter “Hello” to each text box
//		Close browser
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li/ul/li/ul/li/a[@href='basic-first-form-demo.html' and text()='Simple Form Demo']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("Hello");
		Thread.sleep(4000);
		driver.close();
		
	}

}
