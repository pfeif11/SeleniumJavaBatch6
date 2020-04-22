package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		
		//1. set a system property
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pfeif\\eclipse-workspace\\SeleniumJavaBatch6\\drivers\\chromedriver.exe");

		//2/ create object for webdriver type
		WebDriver driver=new ChromeDriver();
		
		//3. navigate to syntax application
		driver.get("https://syntaxtechs.com");
	}

}
