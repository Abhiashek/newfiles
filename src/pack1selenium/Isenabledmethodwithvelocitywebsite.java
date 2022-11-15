package pack1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabledmethodwithvelocitywebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 WebElement textBoxEle = driver.findElement(By.xpath("//input[@id='autocomplete']"));
			boolean  result = textBoxEle.isEnabled();
			System.out.println("is element enabled??->"+result);    //true
			
			if(result == true)
			{
				textBoxEle.sendKeys("India");
			}
			else
			{
				System.out.println("we cant pass the text since the ele is disabaled");
			}

	}

}
