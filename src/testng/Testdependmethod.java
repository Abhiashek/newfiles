package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Testdependmethod {
  @Test
public void logintest()
{
System.out.println();	
Assert.assertTrue(true);
}
  @Test(dependsOnMethods= {"logintest"})
  public void addTocarttest() 
  {
	 System.out.println("addTocarttest"); 
  }
  
  @Test(timeOut = 2000)
	public void testB() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("TestB");
	}


	public void loginTest1()
	{
		System.out.println("loginTest");
		//syntax to fail the TC
		Assert.assertTrue(true);  //Pass
		Assert.assertTrue(false); //fail
		
		Assert.assertFalse(false); //pass
		Assert.assertFalse(true); //fail
	}

  
}
