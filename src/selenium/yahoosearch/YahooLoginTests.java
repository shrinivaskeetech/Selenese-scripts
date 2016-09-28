package selenium.yahoosearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooLoginTests {

	WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.intl=us&.lang=en-US&.done=https%3a//mail.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)

		public void validLogin()
		{
		
		YahooMailPage logIn = new YahooMailPage(driver);
		logIn.Login("shri_nivas007@yahoo.co.in","padma.jillela");
		driver.findElement(By.id("btn-conv-view")).click();
		driver.quit();
		
	}
	
	@Test(priority=2)
	
	public void invalidLogin()
	{
		YahooMailPage logIn = new YahooMailPage(driver);
		logIn.Login("shrinivas", "swathi");
		driver.findElement(By.id("btn-conv-view")).click();
		
		try{
			driver.findElement(By.id("btn-conv-view"));
		}
		catch(NoSuchElementException e){
		
			
		}
		
	}
	
}
