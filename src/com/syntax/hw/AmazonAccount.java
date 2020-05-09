package com.syntax.hw;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAccount {
	public static void main(String[] args) throws IOException {
//		Store configuration in property file to create an Amazon account:
//			browser
//			url
//			name
//			email
//			password
		
		String filePath=System.getProperty("user.dir")+"\\configs\\Amazon.properties";
		FileInputStream fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivershgeckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("ap_customer_name")).sendKeys(prop.getProperty("name"));
		driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("ap_password_check")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("continue")).click();
	}

}
