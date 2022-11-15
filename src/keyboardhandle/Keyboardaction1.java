package keyboardhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	
	driver.get("https://the-internet.herokuapp.com/key_presses");
	System.out.println(" URL is opened");
	Thread.sleep(3000);
	//WebElement textBox=driver.findElement(By.xpath("//input[@id='target']"));
	Actions act =new Actions(driver);
	//act.click(textBox).sendKeys("p").perform();
	act.sendKeys(Keys.SHIFT).perform();
	
	WebElement enterkey =driver.findElement(By.xpath("//p[@id='result']"));
	String Actualkey=enterkey.getText();
	System.out.println(Actualkey);
	
	String ExpectedKey="You entered: SHIFT";
	
	if(ExpectedKey.equals(Actualkey))
	{
		System.out.println("Test Case is Passed");
	}
	else
	{
		System.out.println("Test case is fail");
	}
}
}
