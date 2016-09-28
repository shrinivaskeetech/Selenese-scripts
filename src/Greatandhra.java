import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greatandhra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.greatandhra.com/index.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(".//*[@id='telugu_text']/a")).click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Reviews")).click();
		driver.findElement(By.linkText("'Kabali' Review: Boring To The Core")).click();
		driver.close();
	}

}
