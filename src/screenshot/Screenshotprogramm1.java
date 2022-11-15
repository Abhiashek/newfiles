package screenshot;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshotprogramm1 {
	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TakesScreenshot ts= (TakesScreenshot)driver;
		//ts.getScreenshotAs(null;)--This type is screenshot in byte format
		File seleFile= ts.getScreenshotAs(OutputType.FILE);
		File myfile=new File("D:\\selenium\\Screenshotfolder\\Abhisausedemofile.jpg ");
	   FileHandler.copy(seleFile, myfile);
	   System.out.println("End of programm");
	}

}
