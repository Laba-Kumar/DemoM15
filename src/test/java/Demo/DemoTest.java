package Demo;

import org.testng.annotations.Test;

public class DemoTest 
{

	
@Test(groups="smoke")
public void addTest()
{
	System.out.println("add");
}
@Test(groups="regression")
public void subTest()
{
	System.out.println("Subtract");
}
}
