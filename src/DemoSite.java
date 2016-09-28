import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoSite {
WebDriver driver;

@BeforeClass

public void setup()
{
	driver = new FirefoxDriver();
	driver.get("http://store.demoqa.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}

@Test

public void product(){
	
	
	WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
	Select prd = new Select(element);
	prd.selectByVisibleText("iPads");
	
	
	
	
}





}
