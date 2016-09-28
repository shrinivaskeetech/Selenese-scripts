package selenium.yahoosearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooMailPage {

	WebDriver driver;
	
	public YahooMailPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	public void Login(String username, String password)
	{
		driver.findElement(By.id("login-username")).sendKeys(username);
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys(password);
		driver.findElement(By.id("login-signin")).click();
		
	}
}
