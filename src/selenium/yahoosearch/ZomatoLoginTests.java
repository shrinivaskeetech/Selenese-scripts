package selenium.yahoosearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ZomatoLoginTests {

	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.zomato.com/india#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("login-email")).click();
	
	}
	
	@Test
	
	public void valid() throws InterruptedException{
		
		ZomatoLoginPage login = new ZomatoLoginPage(driver);
		login.LoginZomato("shrinivas.jillela@gmail.com", "zomatologin");
		
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		WebElement orderfodd = driver.findElement(By.partialLinkText("Order Food"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", orderfodd);	
		
		
		
		
		
	}
	
	
	
	
}
