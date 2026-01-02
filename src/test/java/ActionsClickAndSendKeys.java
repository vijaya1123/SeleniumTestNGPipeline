import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClickAndSendKeys extends BaseTest {
	
	//static WebDriver driver;

	@Test
	public void testactionClickSendKeys() {

		//driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();

		
//		WebElement firstNameEle = driver.findElement(By.id("input-firstname"));
//		WebElement agreeCheckBox = driver.findElement(By.name("agree"));

		
		//Actions act = new Actions(driver);
		
//		Equivalent to calling: Actions.click(element).sendKeys(keysToSend). 
//		This method is different from WebElement.sendKeys(CharSequence) - 
//		see sendKeys(CharSequence) for details how.
		//act.sendKeys(firstNameEle, "testing").build().perform();
		
		//Clicks in the middle of the given element. 
		//Equivalent to: Actions.moveToElement(onElement).click()
//		act.click(agreeCheckBox).build().perform();
		
		By fn = By.id("input-firstname");
		By agree = By.name("agree");
		
		doActionsSendKeys(fn, "naveen");
		doActionsClick(agree);
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void doActionsSendKeys(By locator, CharSequence... value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
		//act.dragAndDrop(sourceEle, targetele).build().perform();
		//driver.quit();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
		//act.dragAndDrop(sourceEle, targetele).build().perform();
		//driver.quit();
	}
	
	
	
	
	

}
