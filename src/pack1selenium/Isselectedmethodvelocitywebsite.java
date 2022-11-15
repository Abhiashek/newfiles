package pack1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselectedmethodvelocitywebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		boolean result =  radioButton1.isSelected();
		
		System.out.println("is element selected??-->"+result);
		
		if(result == false)
		{
			radioButton1.click();
			boolean result2 = radioButton1.isSelected();   //true
			System.out.println("is element selected after clicking on it??-->"+result2);
		}
		else
		{
			System.out.println("Radio button is already selected");
		}

	}
}
