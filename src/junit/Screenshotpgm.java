package junit;

import java.io.File;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	
	public void test()throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src, new File("C:\\Users\\DELL\\Desktop\\Luminar Software testing\\ss demo\\Fbpage.png"));
		WebElement button=driver.findElement(By.name("login"));
		File buttonscreenshot=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonscreenshot, new File("./Screenshots//buttonscreenshot.png"));
		
		
	}
	
	

}
