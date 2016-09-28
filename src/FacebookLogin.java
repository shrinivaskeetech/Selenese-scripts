import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://facebook.com");
driver.findElement(By.id("email")).sendKeys("shri_nivas007@yahoo.co.in");
driver.findElement(By.id("pass")).sendKeys("padma.jillela");
driver.findElement(By.id("u_0_1")).click();
//error
//driver.findElement(By.name("q")).sendKeys("satish");

driver.findElement(By.id("userNavigationLabel")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
//driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();


	}

}
