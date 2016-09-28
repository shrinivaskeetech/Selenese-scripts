import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tgmaillogin {
	WebDriver driver;

	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
	}
 
	@Test
	
	public void LoginTest(){
		driver.findElement(By.id("Email")).sendKeys("shrinivas.jillela");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("job@selenium");
		driver.findElement(By.id("signIn")).click();
	}
	
    @Test
    
    public void LogoutTest(){
    	driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.id("gb_71")).click();
    }
    
}
