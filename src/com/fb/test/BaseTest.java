package com.fb.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class BaseTest extends Browser {
Shared s;
	@Test
public void facebookTest(){
		s=new Shared();
		s.getURL(dr, "http://www.facebook.com/");
		s.sendKeys(dr, By.id("email"), "dhdhggdhhg");
		s.sendKeys(dr, By.xpath("//*[@id=\"pass\"]"), "35465567667");
		s.click(dr, By.xpath("//*[@id=\"u_0_b\"]"));
	
	
	}
  // @Test
	public void osaTest() {
		
		dr.get("http://www.osaconsultingtech.com/");
	}
	
	
}
