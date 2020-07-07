package com.fb.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Runner {
public static Properties p;
		
		
		
public static void main(String[] args) throws IOException {
			
			
	
			
  FileInputStream fl=new FileInputStream("C:\\Users\\jamir\\Desktop\\OSA1221201905A\\config.properties");
		
  Properties p =new Properties();	
		p.load(fl);
	 
	System.out.println(p.getProperty("Name"));
	System.out.println(p.getProperty("Address"));
	System.out.println(p.getProperty("Phone"));
	System.out.println(p.getProperty("Email"));
	


		}



}


