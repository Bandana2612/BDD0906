package com.facebook.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver-selnium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath(".//*[contains(text(),'search-alias=watches')]")).click();
		
		List <WebElement> watch = driver.findElements(By.xpath("//*[@class='a-size-base s-inline  s-access-title  a-text-normal']"));
		 for (WebElement webElement : watch) 
		 {
	            System.out.println(webElement.getSize());
	        } 
		
	}

}
