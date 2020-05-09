package com.syntax.hw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2SelectAndDeselect {
//	TC 2: Select and Deselect values
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Input Forms” links
//	Click on “Select Dropdown List” links
//	Select value from “Select List Demo” section
//	Verify value has been selected
//	Select 4 options from “Multi Select List Demo”
//	Deselect 1 of the option from the dd
//	Quit browser
	
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Select Dropdown List')]")).click();
		WebElement we=driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select select=new Select(we);
		List<WebElement> options=select.getOptions();
		for(WebElement list:options) {
			String text=list.getText();
			if(text.equals("Tuesday")) {
				list.click();
				String ddText=list.getText();
				if(ddText.equals("Tuesday")) {
					System.out.println("Tuesday is selected");
				} else {
					System.out.println("Tuesday is not selected");
				}
			}
			
		}
	
		
	}

}
