package com.fb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared extends Browser {

	public void getURL(WebDriver driver, String url) {
	driver.get(url);
}
 
	 
 public void sendKeys(WebDriver dr, By by, String value) {
	dr.findElement(by).sendKeys(value);
	
}	
public void click(WebDriver dr, By by) {
	dr.findElement(by).click();
	
}	
	
	
	
}
