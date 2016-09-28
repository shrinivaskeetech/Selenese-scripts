import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hsbcwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hsbc.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Valuing")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='shareBarLargeDiv']/ul/li[6]")).click();
		
		
		String parentwindowid = driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement Fbicon = driver.findElement(By.xpath(".//*[@id='shareBarLargeDiv']/ul/li[6]"));
		Fbicon.click();
		for(String winHandle : driver.getWindowHandles()){  
			   driver.switchTo().window(winHandle);  
		}
		driver.findElement(By.id("email")).sendKeys("vishwakreddy69@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("fakefake");
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.id("u_0_k")).click();
		
		
		
	}

}
