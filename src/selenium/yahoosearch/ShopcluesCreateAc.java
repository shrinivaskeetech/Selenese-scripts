package selenium.yahoosearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopcluesCreateAc {

	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	
	{
			driver = new FirefoxDriver();
			driver.get("https://secure.shopclues.com/index.php?dispatch=auth.login_form&return_url=index.php");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			
			driver.manage().window().maximize();
			
	}	
		
	@Test
	
	public void CreateAC()
	
	{
		
		ShopcluesLogin CreateAC = new ShopcluesLogin(driver);
		CreateAC.Register("yarram", "karnah", "yarramsettykarna@gmail.com", "123456", "123456", "KPHB hyderabad", "500081");
		driver.findElement(By.xpath(".//*[@id='notification_98dc644a732c2051e7861057851aa74b']/div/div[2]")).click();
		
		
	}
	
	
		
	
}
