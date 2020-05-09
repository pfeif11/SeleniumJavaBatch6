package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {
	
	public static String url="http://the-internet.herokuapp.com";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int numOfLinks=allLinks.size();
		System.out.println(numOfLinks);
		
		for(WebElement link:allLinks) {
			String textOfLink=link.getText();
			String urlOfLink=link.getAttribute("href");
			System.out.println(textOfLink+"  "+urlOfLink);
		}
		

	}

}
