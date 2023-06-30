package junit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazonscreenshot {
	
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	
	public void Test1() throws Exception
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File ("E://amazonpage.png"));
	
	WebElement button=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	File searchbuttscrnsht=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(searchbuttscrnsht, new File ("./Screenshot//searchschot.png"));
		
	}
	
	


}
