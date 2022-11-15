package pack1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplaymethodwithvelocitywebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hideButton.click();
		Thread.sleep(5000);
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result1= textBox.isDisplayed();
		System.out.println("result after clicking on hide button->"+result1);  //false
		Thread.sleep(5000);
		
		WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		showButton.click();
		Thread.sleep(5000);
		boolean result2 = textBox.isDisplayed();
		System.out.println("result after clicking on show button"+result2);  //true
		System.out.println("applying the validation");
		 
		 if(result2 ==true)
		 {
			 System.out.println("element is dispayed");
			 textBox.sendKeys("India-Pakistan Match Asia Cup");
		 }
		 else
		 {
			 System.out.println("element is not displayed");
			 showButton.click();
			 textBox.sendKeys("India-Pakistan Match Asia Cup");
		 }

	}

}
