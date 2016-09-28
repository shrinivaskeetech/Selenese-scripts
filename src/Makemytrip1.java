import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Makemytrip1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[6]/a/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[6]/a/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("from_city_typeahead")).sendKeys("Delhi");
		driver.findElement(By.id("to_city_typeahead")).sendKeys("Mumbai");
		driver.findElement(By.id("start_date_sec")).click();
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[4]")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		driver.findElement(By.id("bus_email")).sendKeys("shrinivas.jillela@gmail.com");
		driver.findElement(By.linkText("Search Buses")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
	}

}
