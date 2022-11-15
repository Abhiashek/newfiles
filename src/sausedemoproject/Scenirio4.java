package sausedemoproject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Scenirio4 {
	//S4. Verify whether we are able to add to product to cart or not
	static WebDriver driver;
	public static void takescreenshot(String screenshotmain) throws IOException
	{
		Date d = new Date();
	DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	String date = d1.format(d);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File seleFile=ts.getScreenshotAs(OutputType.FILE);
		File Myfile =new File("D:\\selenium\\Screenshotfolder\\Sausedemoscreenshotproject\\"+screenshotmain+date+".jpg ");
		FileHandler.copy(seleFile, Myfile);
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		 driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Open the URL");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//takescreenshot("Homepage");


		 WebElement userName = driver.findElement(By.id("user-name"));
		 userName.sendKeys("standard_user");
		
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		System.out.println("Login the Website");
		Thread.sleep(3000);
		
		WebElement btnaddtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		Actions act = new Actions(driver);
		act.click(btnaddtocart).perform();
		Thread.sleep(3000);
		takescreenshot("Addtocart");
		WebElement basketfile =driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		String  actualvalue=basketfile.getText();
		System.out.println(actualvalue);
		String Expectedvalue="1";
		if(actualvalue.equals(Expectedvalue))
		{
			System.out.println("Cart test case is pass");
			
		}
		else
		{
			System.out.println("Cart test case is fail");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
