package com.facebook.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver-selnium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/datepicker/");
		WebElement if1=driver.findElement(By.xpath(".//*[@class='demo-frame']"));
		driver.switchTo().frame(if1);
		
		
		driver.findElement(By.xpath(".//*[@class='hasDatepicker']")).click();
		
		
		//WebElement date=driver.findElements(By.xpath(".//a[@class='ui-datepicker-next ui-corner-all']"));
	}

}
