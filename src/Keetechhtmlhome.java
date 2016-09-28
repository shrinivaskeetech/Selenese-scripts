import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keetechhtmlhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/KEETECH/AppData/Local/Temp/Rar$EXa0.302/SeleniumTest/home.html");
		
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("myHeader");
		WebElement shri = driver.findElement(By.xpath("html/body/div[1]/h3"));
		System.out.println(shri.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("myNavigation");
		driver.findElement(By.linkText("tree")).click();
		
		driver.switchTo().defaultContent();
	
		driver.switchTo().frame("myDetail");
		driver.findElement(By.id("myBtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("myDetail");
		driver.findElement(By.id("myInputText")).sendKeys("hi shri");
		
		driver.findElement(By.id("mySelect")).click();
		driver.findElement(By.xpath(".//*[@id='mySelect']/option[3]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("myDetail");
		driver.findElement(By.linkText("click me to	open a new window")).click();
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("subFrame");
		driver.switchTo().frame("frameHeader");
		WebElement shri1 = driver.findElement(By.xpath("html/body/div/h3"));
		System.out.println(shri1.getText());
		
        driver.switchTo().defaultContent();
        driver.switchTo().frame("subFrame");
		//driver.switchTo().frame("frameHeader");
		driver.switchTo().frame("frameDetail");
		WebElement sri = driver.findElement(By.id("myBtn2"));
		sri.click();
				
		
		
		
		
		
		
		
		
		
        
	}

}
