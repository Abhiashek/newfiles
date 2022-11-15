package keyboardhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Impliocitwaitclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		//ImplicitWait task
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement textBox1 =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		textBox1.sendKeys("Hi Rahul Kumar");
		
		Actions act = new Actions(driver);
		
		//select all
		//ctrl + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		Thread.sleep(3000);
		
		//Copy all
		//ctrl + C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();	    
		Thread.sleep(3000);
		
		WebElement textBox2 =driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		textBox2.click();
		Thread.sleep(3000);
		
		//Paste all
		//ctrl + v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();	
		Thread.sleep(3000);
		
		//compare
		WebElement compareButton =driver.findElement(By.xpath("//div[text()='Compare!']"));
		compareButton.click();
		
		WebElement result =driver.findElement(By.xpath("//span[text()='The two texts are identical!']"));
		String actualResult = result.getText();
		
		String expectedResult = "The two texts are identical!";
		
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
	}

}
