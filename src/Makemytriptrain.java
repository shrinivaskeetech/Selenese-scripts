import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Makemytriptrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[7]/a")).click();
		driver.findElement(By.xpath(".//*[@id='from_city_data_box']")).sendKeys("Secunderabad (SCJN), India");
		driver.findElement(By.xpath(".//*[@id='to_city_data_box']")).sendKeys("Bangalore, India");
		
		
		driver.findElement(By.id("start_date_sec")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();
		driver.findElement(By.id("class_select")).click();
		driver.findElement(By.xpath(".//*[@id='class_select']/option[3]")).click();

		driver.findElement(By.linkText("Search Trains")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}

}
