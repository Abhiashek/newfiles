package collection;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementInCollection {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 WebElement userName = driver.findElement(By.id("user-name"));
		 userName.sendKeys("standard_user");
		
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		List<WebElement>allProducts=driver.findElements(By.xpath("//button[text()='Add to cart']"));
//		allProducts.get(0).click();
//		allProducts.get(1).click();
//		allProducts.get(2).click();
//		allProducts.get(3).click();
//		allProducts.get(4).click();
//		allProducts.get(5).click();
		//code repetet 
		
		//So we can use the for loop
//		for(int i=0; i<allProducts.size();i++)
//		{
//			allProducts.get(i).click();
//		}
		
		//another method for eachloop
		for(WebElement abhi :allProducts )
		{
			abhi.click();
		}
		
		
		

	}

}
