package mouceclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Noramalclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println(" URL is opened");
		Thread.sleep(3000);
		
		 WebElement userName = driver.findElement(By.id("user-name"));
		 userName.sendKeys("standard_user");
		 Thread.sleep(3000);
		 		
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(-1000);
		  
		 WebElement loginButton = driver.findElement(By.id("login-button"));
		 Actions act =new Actions(driver);
		 act.click(loginButton).perform();

	}

}
