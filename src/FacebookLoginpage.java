import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginpage {
	WebDriver driver;

	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}


  @Test
 
  public void Login(String Uname, String Pswd)
  {
	  
	  driver.findElement(By.id("email")).sendKeys(Uname);
	  driver.findElement(By.id("pass")).sendKeys(Pswd);
	  driver.findElement(By.id("u_0_l")).click();
	  
  }


	@DataProvider  (name="UnamePswdprovider")

	public Object[][] getUnamePswdprovider() throws FileNotFoundException, IOException {




		Properties fb = new Properties();

		fb.load(new FileInputStream(new File("/SeleniumTraining/src/FB.properties")));


		String s1 = fb.getProperty("Uname");
		String s2= fb.getProperty("Pswd");
		String[][] Stringarray =new String [1][2];

		Stringarray[0][0] = s1;
		Stringarray[0][1] = s2;

		return Stringarray;
	}
}