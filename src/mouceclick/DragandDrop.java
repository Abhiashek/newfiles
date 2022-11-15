package mouceclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println(" URL is opened");
		Thread.sleep(3000);
		
	WebElement captitalele=driver.findElement(By.xpath("//div[@id='box3']"));
	WebElement countryele=driver.findElement(By.xpath("//div[@id='box103']"));
	Actions act =new Actions(driver);
	
	//act.dragAndDrop(captitalele, countryele).perform();
	act.dragAndDrop(captitalele, countryele).build().perform();
	
		
	}

}
