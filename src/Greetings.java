import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greetings {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("http://www.123greetings.com/");


driver.manage().window().maximize();
driver.findElement(By.xpath("html/body/div[1]/div[6]/div[3]/ul/li[1]/div[2]/h2/a")).click();
driver.findElement(By.xpath(".//*[@id='eaug_friendshipday_happy']/div[4]")).click();

driver.findElement(By.xpath(".//*[@id='card_send2']/ul/li[2]/button")).click();

driver.findElement(By.id("sname0")).sendKeys("shri");

driver.findElement(By.id("semail0")).sendKeys("cyarlapati@gmail.com");
driver.findElement(By.id("message1")).sendKeys("hi automation..!!");

driver.findElement(By.id("rname1")).sendKeys("cnu");
driver.findElement(By.id("remail1")).sendKeys("shrinivas.jillela@gmail.com");
driver.findElement(By.xpath(".//*[@id='notify_header']/span/a")).click();
driver.findElement(By.xpath(".//*[@id='dp-popup']/div[3]/table/tbody/tr[5]/td[3]")).click();
driver.findElement(By.id("send_btn")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

}
