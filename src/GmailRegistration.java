import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailRegistration {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("FirstName")).sendKeys("baahubali");
		driver.findElement(By.id("LastName")).sendKeys("telugu123");
		
		driver.findElement(By.id("GmailAddress")).sendKeys("baahubali.telugu123");
		driver.findElement(By.id("Passwd")).sendKeys("bbprarss");
		driver.findElement(By.name("PasswdAgain")).sendKeys("bbprarss");
		
		
		driver.findElement(By.xpath("//div[@role='listbox']")).sendKeys("July");
		
			driver.findElement(By.id("BirthDay")).sendKeys("12");
		
		driver.findElement(By.id("BirthYear")).sendKeys("1987");
		
		driver.findElement(By.xpath("//div[@aria-activedescendant=':d']")).sendKeys("Male");
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9642004374");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("shrinivas.jillela@gmail.com");
		driver.findElement(By.xpath("//div[@id='CountryCode']/div")).sendKeys("Algeria");
		driver.findElement(By.id("submitbutton")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
	
	}
	
	

}
