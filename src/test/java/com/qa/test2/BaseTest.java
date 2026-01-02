package com.qa.test2;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.chaintest.plugins.ChainTestListener;

@Listeners(ChainTestListener.class)
public class BaseTest {
	
	protected static  WebDriver driver ;
	
	@BeforeTest
	public void startDriver() {
		driver= new DriverManager().initilizedDriver();
		//driver=  new ChromeDriver();
		
	}
	
	@AfterTest
	public void quitDriver() {
		driver.quit();
		
	}


}
