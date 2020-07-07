package com.fb.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jamir\\Desktop\\OSA1221201905A\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		 dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 dr.manage().window().maximize();

		 dr.findElement(By.xpath("//*[@id=\"DCKVMuk4jFI9D93LCn5UHQ\"]")).click();
		
		// dr.findElementByXPath("").click();	  


	 // Select x =new Select(dr.findElement(By.xpath("//*[@id=\"nav-search-dropdown-card\"]/div")));
	  //x.selectByVisibleText("Books");
		
		// value="search-alias=baby-products";
		// Select dd = new Select(dr.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
		//	dd.selectByValue("search-alias=baby-products");
		
		 
		 
		 

	}
	}

