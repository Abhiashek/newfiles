package com.baseclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pom.all.Loginpomclass;
import com.sausedemo.utlity.Class.Screenshot;

public class LoginBaseClass {
public WebDriver driver;
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
    	if(browserName.equals("chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", 
					"D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver", 
				"D:\\selenium\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("end of program");
		}

		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screesnhot
		Screenshot.TakeScrrenshot(driver,"sausedemobrowser");
		
		
		//loginPage elements find +action perform
		
	Loginpomclass x = new Loginpomclass(driver);
		
		x.sendUsername();
		System.out.println("username is entered");
		
		x.sendpassword();
		System.out.println("Password is entered");
		
		x.clickonlogin();
		System.out.println("Clicked on login button");
		Screenshot.TakeScrrenshot(driver,"sausedemologin");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		System.out.println("browser is close");
		System.out.println("End of the programm");
	}

}
