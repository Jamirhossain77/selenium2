package com.fb.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
   WebDriver dr;

@Before
public void openBroser() {
String key ="webdriver.chrome.driver";
String value ="C:\\Users\\jamir\\Desktop\\OSA1221201905A\\chromedriver.exe";
System.setProperty(key, value);
dr = new ChromeDriver();
	

}
//@After
   public void closeBrowser() {
	dr.close();
	
}

}
