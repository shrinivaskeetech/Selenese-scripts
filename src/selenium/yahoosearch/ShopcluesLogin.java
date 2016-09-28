package selenium.yahoosearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopcluesLogin {

	WebDriver driver;
	
	public ShopcluesLogin(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void Register(String FirstName, String LastName, String eMailID, String Password, String ConfirmPassword, String AddressLine, String Pincode)
	{
		
		driver.findElement(By.id("b_firstname")).sendKeys(FirstName);
		driver.findElement(By.id("b_lastname")).sendKeys(LastName);
		driver.findElement(By.id("reg_email")).sendKeys(eMailID);
		driver.findElement(By.id("password1")).sendKeys(Password);
		driver.findElement(By.id("password2")).sendKeys(ConfirmPassword);
		driver.findElement(By.id("b_address")).sendKeys(AddressLine);
		driver.findElement(By.id("b_zipcode")).sendKeys(Pincode);
		driver.findElement(By.xpath(".//*[@class='ml_function_button_createaccountRegister']")).click();
		
	}

	
		
	}
	
