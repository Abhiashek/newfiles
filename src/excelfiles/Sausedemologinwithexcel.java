package excelfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sausedemologinwithexcel {
	public static void main(String[]args) throws IOException
	{
		String path = "D:\\selenium\\Screenshotfolder\\ExcelFolder\\sausedemologin.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		String username = wb.getSheet("pp").getRow(0).getCell(0).getStringCellValue(); 
		String passWord = wb.getSheet("pp").getRow(1).getCell(0).getStringCellValue(); 

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 WebElement userName = driver.findElement(By.id("user-name"));
		 userName.sendKeys(username);
		
		 WebElement password = driver.findElement(By.id("password"));
		 password.sendKeys(passWord);
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

}
