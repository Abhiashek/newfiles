package pack1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sausedemogetmethodvalidation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("user-name"));
       username.sendKeys("standard_user");
       Thread.sleep(3000);
       
       WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("secret_sauce");
       Thread.sleep(3000);
       
       WebElement loginButton=driver.findElement(By.id("login-button"));
      // loginbtn.click();
       
       
       //getmethod
       String eleText = loginButton.getText();
		System.out.println("ele text->"+eleText);
		
		String eleAttri= loginButton.getAttribute("id");
		System.out.println("Attribute value of id is->"+eleAttri);
		
		String eleTagName= loginButton.getTagName();
		System.out.println("tagname of ele->"+eleTagName);
       
	}

}
