import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	   
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
						
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		
		
		
         //driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		
		driver.findElement(By.xpath(".//*[@id='flightSearchContainer']/div[3]/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[1]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']/option[2]")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_DropDownListCurrency']/option[2]")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
}
}