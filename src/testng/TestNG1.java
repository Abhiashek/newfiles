package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	@AfterMethod
	public void method1()
	{
		System.out.println("method1");
	}
	@Test
	public void method2()
	{
		System.out.println("Method2");
	}
	@BeforeMethod
	public void method3()
	{
		System.out.println("Method3");
	}
	
	
		
		
		
	

}
