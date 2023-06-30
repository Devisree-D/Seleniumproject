package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpgm {
	
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	
	public void Test()
	{
		driver.findElement(By.id("email")).sendKeys("varshasuresh821@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Var23");
		driver.findElement(By.name("login")).click();
	}

}
