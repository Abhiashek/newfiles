package mouceclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Howemouseonflipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement username=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	username.sendKeys("8412965949");
	Thread.sleep(3000);
	
	WebElement password=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	password.sendKeys("abhi@8191");
	Thread.sleep(3000);
	
	WebElement Loginbtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	Loginbtn.click();
	
	Thread.sleep(3000);
	WebElement move=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[5]"));
	Actions Act =new Actions(driver);
	Act.moveToElement(move).perform();
	Thread.sleep(3000);
	WebElement gameing=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]"));
	Act.moveToElement(gameing).perform();
	Thread.sleep(3000);
	WebElement Games=driver.findElement(By.linkText("Games"));
	Act.moveToElement(Games).click().perform();
	//Games.click();
	Thread.sleep(5000);
}
}
