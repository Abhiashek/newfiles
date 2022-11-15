package testng;

import org.testng.annotations.Test;

public class Testngpriority {
	@Test(priority = 3)
	public void testA() {
		System.out.println("TestA");
	}
	@Test(priority=1 )
	public void testB()
	{
		System.out.println("TestB");
	}
	@Test(priority=2, invocationCount =0)
	public void testc()
	{
		System.out.println("TestC");
	}

}
