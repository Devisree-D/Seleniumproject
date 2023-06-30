package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countpgm {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	
	public void Test1()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links= "+li.size());
		
		for(WebElement x:li)
		{
			
			String link=x.getAttribute("href");
			String linktext=x.getText();
			System.out.println(link+"------"+linktext); 
		}
}
}