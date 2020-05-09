package com.syntax.hw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFB {
//	TC 1: Facebook dropdown verification
//	Open chrome browser
//	Go to �https://www.facebook.com�
//	Verify:
//	month dd has 12 month options
//	day dd has 31 day options
//	year dd has 115 year options
//	Select your date of birth	
//	Quit browser
	public static String url="https://www.facebook.com";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select selectm=new Select(month);
		Select selectd=new Select(day);
		Select selecty=new Select(year);
		
		selectm.selectByIndex(8);
		selectd.selectByIndex(1);
		selecty.selectByValue("1987");
		System.out.println(selectm.isMultiple());
		Thread.sleep(3000);
		//driver.close();
		
	}

}
