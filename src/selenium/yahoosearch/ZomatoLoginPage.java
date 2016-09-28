package selenium.yahoosearch;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ZomatoLoginPage {

WebDriver driver;
	
	public ZomatoLoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}

public void LoginZomato(String username, String password){
	

       driver.findElement(By.id("ld-email")).sendKeys(username); 
       driver.findElement(By.id("ld-password")).sendKeys(password);
       driver.findElement(By.id("ld-submit-global")).click();
       
}
}