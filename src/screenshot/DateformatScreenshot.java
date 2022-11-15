package screenshot;

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
import org.openqa.selenium.io.FileHandler;

public class DateformatScreenshot {
	static WebDriver driver;
	public static void screenshot1(String screenshotname) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);

	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File selfile=ts.getScreenshotAs(OutputType.FILE);
		File Myfile= new File("D:\\selenium\\Screenshotfolder\\"+screenshotname+date+".jpg");
		FileHandler.copy(selfile, Myfile);
		
	}
	
	
	public static void main(String[]args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		screenshot1("Homepage");
		
		
		
		//Loginpage
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		Thread.sleep(1000);
		screenshot1("Loginpage");
	}

}
