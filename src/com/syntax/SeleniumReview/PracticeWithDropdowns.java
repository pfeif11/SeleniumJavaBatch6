package com.syntax.SeleniumReview;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWithDropdowns {
	
	public static String url="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		List<WebElement> allDDs=driver.findElements(By.tagName("a"));
		
		for(WebElement oneDD:allDDs) {
			String dd=oneDD.getText();
			System.out.println(dd);
			if(dd.equals("List Box")) {
				oneDD.click();
			}
		}
		
		//if(dd.equals("Bootstrap List Box")) {
		//	oneDD.click();
		}
		List<WebElement> listOfDD=driver.findElements(By.tagName("li"));
	
		for(WebElement oneItem:listOfDD) {
			String item= oneItem.getText();
			if(item.contentEquals("Bootstrap List Box")) {
				oneItem.click();
				if(item.equals("Morbi leo risus")) {
					oneItem.click();
					break;
				}
				
			}
			
		}
	}

}
