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

public class Loginsausdemoscreenshot {
	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 WebElement userName = driver.findElement(By.id("user-name"));
		 userName.sendKeys("standard_user");
		
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File seleFile=ts.getScreenshotAs(OutputType.FILE);
		File Myfile =new File("D:\\selenium\\Screenshotfolder\\Abhisausedemologinfile.jpg ");
		FileHandler.copy(seleFile, Myfile);
			}

}
