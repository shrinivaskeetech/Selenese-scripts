import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Keetechhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/KEETECH/AppData/Local/Temp/Rar$EXa0.538/SeleniumTest/home.html");
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
		driver.switchTo().defaultContent();
		
		//using select clicking on option3
		driver.switchTo().frame("myDetail");
		WebElement selectelement = driver.findElement(By.id("mySelect"));
		Select select = new Select(selectelement);
		select.selectByVisibleText("option3");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("subFrame");
		driver.switchTo().frame("frameDetail");
		WebElement btn = driver.findElement(By.id("myBtn2"));
		System.out.println("Button Text: "+btn.getAttribute("value"));
	}

}
