package pack1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sausedemovalidatewithcart {
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
   loginButton.click();
  WebElement bagEle =driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
  bagEle.click();
  WebElement basketfile =driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
  
  String actualproductselected=basketfile.getText();
  System.out.println(actualproductselected);
  
  
   String exceptedproductselected="1";
  if(exceptedproductselected.equals(actualproductselected))
  {
	  System.out.println("Test case is passed");
	  
  }
  else
  {
	  System.out.println("Test case is fail");
  }
}
	
	

}
