package selenium.yahoosearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YahooSearch {
	



	
	@Test
	
	public void Search()
	
	{
       WebDriver driver = new FirefoxDriver();
		
		driver.get("https://in.yahoo.com/?p=us");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        WebElement searchfield = driver.findElement(By.id("UHSearchBox"));
        searchfield.clear();
        searchfield.sendKeys("facebook");
        driver.findElement(By.id("UHSearchWeb")).click();
         driver.findElement(By.partialLinkText("Log into Facebook")).click();
       
	}
	
	@Test
	
	public void Yahoonews()
	{
		 WebDriver driver = new FirefoxDriver();
			
			driver.get("https://in.yahoo.com/?p=us");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.linkText("News"));
		element1.click();
       
       
    }
    
    }
