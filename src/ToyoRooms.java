




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ToyoRooms{

	
	WebDriver driver;
	
 @BeforeClass
 
 public void setup(){
	
	
	driver = new FirefoxDriver();
	
	driver.get("https://www.oyorooms.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
	
	@Test
	
	public void City(){
		driver.findElement(By.id("js-searchbar-input-location")).sendKeys("Hyderabad  Telangana,  India ");
	}
	
@Test

public void datepicker(){
	//WebElement element=driver.findElement(By.id("js-checkin"));
	//element.click();
	
			driver.findElement(By.xpath(".//*[@id='js-checkin']")).click();
			driver.findElement(By.linkText("25")).click();
			
			//Select date=new Select
			//date.selectByVisibleText("25");

}

	
}	
	
	
	
	
	
	
	
	
	



