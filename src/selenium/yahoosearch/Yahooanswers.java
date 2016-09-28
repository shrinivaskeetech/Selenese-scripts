package selenium.yahoosearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Yahooanswers {

	@Test

public void Yahooanws()
{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.answers.yahoo.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement element6 = driver.findElement(By.id("UHSearchBox"));
	    element6.clear();
	    element6.sendKeys("what is selenium");
		driver.findElement(By.id("UHSearchProperty")).click();
		
}

@Test

public void Yahoomovies()

{
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://in.yahoo.com/?p=us");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.linkText("Movies")).click();
 
	
	
	
	
	
}









}
