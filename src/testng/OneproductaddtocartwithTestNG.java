package testng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.all.Homepagepomclass;
import com.pom.all.Loginpomclass;

public class OneproductaddtocartwithTestNG {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//take screesnhot
		Thread.sleep(3000);
		
		
		
		//loginPage elements find +action perform
		
		Loginpomclass x = new Loginpomclass(driver);
		
		x.sendUsername();
		System.out.println("username is entered");
		
		x.sendpassword();
		System.out.println("Password is entered");
		
		x.clickonlogin();
		System.out.println("Clicked on login button");
		Thread.sleep(3000);
	}
	@Test
	public void verifyproductfunctionality()
	{
		Homepagepomclass x = new Homepagepomclass(driver);
		x.clickoneproduct();
		System.out.println("One product is add to  cart");
       String exceptedProduct = "1";
		
		String actualProduct =x.carttext();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		if(exceptedProduct.equals(actualProduct))
		{
			System.out.println("Bag product add to cart case is passed");
		}
		else
		{
			System.out.println("Bag product add to cart case is failed");
		}

	}
	@AfterMethod
	public void tearDown()
	{
		
		   driver.quit();
	       System.out.println("browser is closed");
	       
	       System.out.println("end of Program");	
	}
}
