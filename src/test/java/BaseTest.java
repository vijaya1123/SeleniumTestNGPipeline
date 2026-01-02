

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

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
