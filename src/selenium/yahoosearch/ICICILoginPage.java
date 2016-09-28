package selenium.yahoosearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ICICILoginPage {

	
	
	WebDriver driver;
	public ICICILoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void logintoICICI(String username,String password)
	{
	  
		
		driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys(username);
		driver.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys(password);
		driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







