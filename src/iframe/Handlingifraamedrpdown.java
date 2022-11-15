package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handlingifraamedrpdown {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
//		System.out.println("end of program");
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe);
		WebElement iframe1 =driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(iframe1);
		WebElement ck=driver.findElement(By.xpath("//input[@id='a']"));
		Actions act = new Actions(driver);
		act.click(ck).perform();
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		Thread.sleep(3000);
		WebElement iframe3 =driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(iframe3);
		WebElement dropDown= driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
		Select s=new Select(dropDown);
		Thread.sleep(2000);
		s.selectByValue("big baby cat");
	    dropDown.click();
		
		System.out.println("end of program");
		
	}

}
