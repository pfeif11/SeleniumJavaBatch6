package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	
	public static String url="http://amazon.com";
//	Go to amazon.com
//	 * select books from the search dropdown
//	 * type Harry potter
//	 * and click on Search
//	 * check Unofficial CookBook checkbox on the left under Book Series

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	WebElement searchDropDown=driver.findElement(By.tagName("select"));
	Select selectDD=new Select(searchDropDown);
	List<WebElement> ddOptions=selectDD.getOptions();
	
	for(WebElement dd:ddOptions) {
		String optionText=dd.getText();
		System.out.println(optionText);
		
	}
	selectDD.selectByVisibleText("Books");
	WebElement searchTextbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	searchTextbox.sendKeys("Harry Potter");
	WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']"));
	searchButton.click();
	
	List<WebElement> bookSeriesCheckboxes=driver.findElements(By.className("a-spacing-micro"));
	for(WebElement bookSeriesCheckbox:bookSeriesCheckboxes) {
		String checkboxText=bookSeriesCheckbox.getText();
		if(checkboxText.equals("Unofficial Cookbook") && !bookSeriesCheckbox.isSelected()) {
			Thread.sleep(2000);
			bookSeriesCheckbox.click();
			break;
		}
	}
	
	
}
}
