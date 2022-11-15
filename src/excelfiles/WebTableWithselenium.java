package excelfiles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableWithselenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//single data fetch
//		WebElement result=driver.findElement(By.xpath("//td[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']"));
//		String cellData=result.getText();
//		System.out.println(cellData);
		
		
		//Multiple Data fetch -Headers
		
		
//    List<WebElement> headers= driver.findElements(By.xpath("//table//tbody//tr//th"));
//    System.out.println("Total columns are--"+headers.size());
//    for(int i=0;i<headers.size();i++)
//    {
//    	System.out.println(headers.get(i).getText());
//    }
    
    List <WebElement> allcelldata= driver.findElements(By.xpath("//table//tbody//tr//td"));
    System.out.println("TotalCells->"+allcelldata.size());
    for(int i=0;i<allcelldata.size();i++)
    {
//    	WebElement cell =allcelldata.get(i);
//    	String cellData = cell.getText();
//    	System.out.println(cellData);

    	 //System.out.println(allcelldata.get(i).getText());	
    }

   


		

	}

}
