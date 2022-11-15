package pack1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownlistinvtctpune {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropDown.click();
      Select s = new Select(dropDown);
		
//		s.selectByIndex(2);
//		s.selectByValue(null);
		s.selectByVisibleText("Option2");
		
	//	s.selectByValue("option2");


	}

}
