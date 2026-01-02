package com.qa.test2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownWithoutSelectTag  extends BaseTest {

	//static WebDriver driver;

	@Test()
	public void testDropDownWithoutSelectTag() throws InterruptedException {
		//driver = new ChromeDriver();
		driver.get("https://www.cardekho.com");
		driver.manage().window().maximize();

		
		Thread.sleep(4000);
		
		driver.findElement(By.id("vehicleTypeName")).sendKeys("S");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//li[contains(text(),'SUV')]")).click();
		


	}

}
