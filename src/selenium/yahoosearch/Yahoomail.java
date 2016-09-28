package selenium.yahoosearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Yahoomail {

	@Test
	
	public void mail()
	{
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://in.yahoo.com/?p=us");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebElement element2 = driver.findElement(By.linkText("Mail"));
    element2.click();
    
	}
	
	@Test
	
	public void yahoocricket()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cricket.yahoo.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement element3 = driver.findElement(By.xpath(".//*[@id='navigation']/div/div/div[1]/ul/li[2]/a/span"));
	    element3.click();
	}
	
	
	
	
}
