package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	
	
	
		@Before
		
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
		@Test
		
		public void Test()
		{
			driver.findElement(By.name("q")).sendKeys("Harry potter",Keys.ENTER);
			
	}
	

}
