package testng;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtabopen {

	WebDriver driver;
	String baseurl="https://www.google.com";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoad() {
		driver.get(baseurl);
	}
	@Test
	public void test1() throws AWTException {
		String parentwindow=driver.getWindowHandle();
		WebDriver wb=driver.switchTo().newWindow(WindowType.TAB);
		wb.get("https://www.amazon.in");
//		Robot robo=new Robot();
//		robo.keyPress(KeyEvent.VK_CONTROL);
//		robo.keyPress(KeyEvent.VK_T);
//		robo.keyRelease(KeyEvent.VK_CONTROL);
//		robo.keyRelease(KeyEvent.VK_T);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
			String title=driver.getTitle();
			System.out.println(title);
		}
		
	}
	
}
