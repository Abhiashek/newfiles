package listeners;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)
public class Sampleclass1 
{
@Test
public void testA()
{
	System.out.println("Test-A");
	Assert.assertTrue(true);
}
@Test
public void testb()
{
	System.out.println("Test-B");
	Assert.assertTrue(false);
}
}
