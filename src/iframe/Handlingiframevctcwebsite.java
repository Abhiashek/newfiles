package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingiframevctcwebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");//scroll down
		Thread.sleep(3000);
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(iframe);
		//JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1400)");
		Thread.sleep(3000);
		WebElement tab=driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
		Thread.sleep(2000);
		tab.click();
		System.out.println("End of Programm");
	}

}
