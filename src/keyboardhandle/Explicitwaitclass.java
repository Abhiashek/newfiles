package keyboardhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Explicit Wait
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement username=driver.findElement(By.id("user-name"));
		wait.until(ExpectedConditions.visibilityOf(username));
       username.sendKeys("standard_user");
       Thread.sleep(3000);
       
       WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("secret_sauce");
       Thread.sleep(3000);
       
       WebElement loginButton=driver.findElement(By.id("login-button"));
       loginButton.click();
	}

}
