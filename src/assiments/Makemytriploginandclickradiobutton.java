package assiments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytriploginandclickradiobutton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement radiobtn=driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[1]/ul/li[2]"));
		 Actions act =new Actions(driver);
		 act.click(radiobtn).perform();
	}

}
