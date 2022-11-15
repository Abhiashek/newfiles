package popuphandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement startseleniumpractice=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	startseleniumpractice.click();

	List<String> allPageAddresses = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(allPageAddresses.get(1));
	System.out.println("allPageAddresses are->"+allPageAddresses);
	
	WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	textBox.sendKeys("Velocity o4th JuneBatch");

	System.out.println("end of program");

}
}
