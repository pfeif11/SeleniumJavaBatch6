package com.syntax.hw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1ListVerification {
//	TC 1: Amazon Department List Verification
//	Open chrome browser
//	Go to “http://amazon.com/”
//	Verify how many department options available.
//	Print each department 
//	Select Computers
//	Quit browser
	public static String url="http://amazon.com/";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select selectAll=new Select(all);
		List<WebElement> values=selectAll.getOptions();
		int totalValues=values.size();
		System.out.println(totalValues);
		for(WebElement allValues:values) {
			String text=allValues.getText();
			System.out.println(text);
			if(text.equals("Computers")) {
				allValues.click();
			}
		}
		Thread.sleep(3000);
		driver.close();
	

		}
		
		
	}



