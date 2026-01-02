package com.qa.test2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DropDownHandleWithoutSelectClass  extends BaseTest {

	//static WebDriver driver;

	@Test()
	public void testDropDownWithoutSelect(){

		//driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		driver.manage().window().maximize();


		//By options = By.xpath("//select[@id='Form_getForm_Country']/option");
		By options = By.cssSelector("select#Form_getForm_Country > option");

		List<WebElement> optionsList = driver.findElements(options);

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("India")) {
				e.click();
				break;
			}
		}

	}
	
	

}
