package findadress;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAddressTitleurlclass {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//how to find the address of the webPage??
		
				//getWindowHandle method
				
				String address = driver.getWindowHandle();
				System.out.println(address);
				
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				String title = driver.getTitle();
				System.out.println(title);
			

	}

}
