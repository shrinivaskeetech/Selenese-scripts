package selenium.yahoosearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ICICILoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	
	@DataProvider(name="ICICILoginPage")
	public Object[][] ICICIuser() throws IOException, IOException
	{
		Properties props=new Properties();
		props.load(new FileInputStream(new File("D:\\selenium scripts\\SeleniumTraining\\ICICI.properties")));
		int size=props.size();
		
		
		String[][] str=new String[size/2][2];
		for(int i=0;i<size/2;i++)
		{
			str[i][0]=props.getProperty("username"+i);
			str[i][1]=props.getProperty("password"+i);
		}
		return str;
		
	}
	@Test(dataProvider="ICICILoginPage")
	public void Login(String username,String password)
	{
		ICICILoginPage login=new ICICILoginPage(driver);
		login.logintoICICI(username, password);
		Assert.assertEquals(driver.getTitle(), "Welcome to ICICI Bank Internet Banking.");
}
	/*@Test
	public void Login()
	{
		Way2sms login=new Way2sms(driver);
		login.logintoway2sms("9492055182", "9493807483k");
	}*/
	
	
	
	
	
	
}
