import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
	//Way2smsloginandSendmesg.	
WebDriver driver=new FirefoxDriver();
driver.get("http://site23.way2sms.com/content/index.html");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='Login']/div[2]/form/div[1]/input")).sendKeys("9885368853");
driver.findElement(By.xpath(".//*[@id='Login']/div[2]/form/div[2]/input")).sendKeys("jsjs");
driver.findElement(By.id("loginBTN")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
driver.switchTo().frame("frame");
driver.findElement(By.id("mobile")).sendKeys("9553970958");
driver.findElement(By.id("message")).sendKeys("hi");
driver.findElement(By.id("Send")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.switchTo().defaultContent();

//driver.findElement(By.xpath(".//*[@id='mainBody']/div[5]/div/ul/li[7]")).click();
	






	}

}
