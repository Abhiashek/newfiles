package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Homepagewithlogintwoscreenshots {
	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File selfile=ts.getScreenshotAs(OutputType.FILE);
		File Myfile= new File("D:\\selenium\\Screenshotfolder\\Abhisausedemo1.jpg");
		FileHandler.copy(selfile, Myfile);
		
		//Loginpage
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		File selefile1=ts.getScreenshotAs(OutputType.FILE);
		File Myfile1 =new File("D:\\selenium\\Screenshotfolder\\AbhiLoginsausedemo1.jpg");
		FileHandler.copy(selefile1, Myfile1);
		
		
	
		
	}

}
