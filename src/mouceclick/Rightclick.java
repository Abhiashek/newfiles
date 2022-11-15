package mouceclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	
	driver.get("https://demoqa.com/buttons");
	System.out.println(" URL is opened");
	Thread.sleep(3000);
	 WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	 
	 Actions act = new Actions(driver);
	 
	 act.contextClick(rightClickButton).perform();

	 String exepctedMessage = "You have done a right click";  //BA-dev
	 
	 WebElement messageDisplay= driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
	 String actualMessage= messageDisplay.getText();       //actual
	 
	 if(exepctedMessage.equals(actualMessage))
	 {
		 System.out.println("TC is passed");
	 }
	 else
	 {
		 System.out.println("TC is failed");
	 }
	 

	
	 
	 
}
}
