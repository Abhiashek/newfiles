package popuphandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopuphandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		System.out.println("Url is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement clickme1=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme1.click();
		System.out.println("Clicked on first clickme button");
		Alert alt =driver.switchTo().alert();
		alt.accept();
		WebElement clickme2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickme2.click();
		System.out.println("Clicked on Second clickme button");
		Thread.sleep(5000);
		//Alert alt1 =driver.switchTo().alert();
		alt.accept();
		
		WebElement clickme3=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickme3.click();
		System.out.println("Clicked on Third clickme button");
		Thread.sleep(6000);
		//Alert alt1 =driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();
		
		WebElement clickme4=driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickme4.click();
		System.out.println("Clicked on fourth clickme button");
		Thread.sleep(6000);
		//Alert alt1 =driver.switchTo().alert();
		alt.sendKeys("Abhishek");
		Thread.sleep(6000);
		alt.accept();
		
		
		System.out.println("End of the programm");
		
	}
	

}
