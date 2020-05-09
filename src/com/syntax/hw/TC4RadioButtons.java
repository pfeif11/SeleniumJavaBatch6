package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4RadioButtons {
	
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
//	TC 4: Radio Buttons Practice  
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Input Forms” links
//	Click on “Radio Buttons Demo” links
//	Click on any radio button in “Radio Button Demo” section.
//	Verify correct radio is clicked
//	Click on any radio button in “Group Radio Buttons Demo” section.
//	Verify correct checkbox is clicked
//	Quit browser
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.xpath("//li/ul/li/ul/li/a[text()='Radio Buttons Demo']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		boolean isSelected=element.isSelected();
		System.out.println(isSelected);
	}

}
