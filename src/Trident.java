

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Trident {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tridenthotels.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[3]/span[2]/span/span[1]")).click();
		//driver.findElement(By.partialLinkText("Hyderabad")).click();
		
		WebElement element=driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[3]/span[2]/span/span[2]/span"));
		Select se=new Select(element);
		se.deselectByVisibleText("Trident, Hyderabad");
		
		
		
		
		//driver.findElement(By.xpath("html/body/div[3]/div/div/div/div[3]/span[2]/span/span[2]/span")).click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.xpath(".//*[@id='reservationConsoleSelectHotel_option_selected']")).click();
		
		
		
		
		
		
		
	}

}
