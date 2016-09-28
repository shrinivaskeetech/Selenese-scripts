import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newredbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.redbus.in/");
        driver.manage().window().maximize();
        WebElement rFrom = driver.findElement(By.id("txtSource"));
        rFrom.sendKeys("Bangalore");
        rFrom.sendKeys(Keys.TAB);
        WebElement rTo = driver.findElement(By.id("txtDestination"));
        
      
		rTo.sendKeys("Chennai");
        
        rTo.sendKeys(Keys.TAB);
     
	
		
		
		
		
		
		
		
		
		
		
	}

}
