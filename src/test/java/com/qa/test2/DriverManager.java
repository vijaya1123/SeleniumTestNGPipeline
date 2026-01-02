package com.qa.test2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager extends BaseTest{
	
	public WebDriver initilizedDriver() {
		
	 // driver=  new ChromeDriver();
		//return driver;
		
		 ChromeOptions options = new ChromeOptions();
//	        // Set Firefox Headless mode as TRUE
	        options.addArguments("--headless=new");
//	        // Create an object of WebDriver class and pass the Chrome Options object
//	        // as an argument
        driver = new ChromeDriver(options);
	        return driver;
	 
		
	}

}
