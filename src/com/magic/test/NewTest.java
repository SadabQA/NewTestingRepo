package com.magic.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest 
{
	
	@Test
	public void openGoogle()
	{
		WebDriverManager.chromedriver().setup();
    	ChromeDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.facebook.com/");
    	System.out.println("Open facebook..........");
    	
	}

}
