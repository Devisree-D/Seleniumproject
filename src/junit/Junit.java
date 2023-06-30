package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void test2()
	{
		String actualtitle="Google";
		String exp="Google";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("PASS");
			}
		else
		{
			System.out.println("FAIL");
		}
	}
	@After
	public void stop()
	{
		driver.quit();
	}

}
