package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonpgautomate {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urloading() {
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
	}
	@Test
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
				
			}
			driver.switchTo().window(parentwindow);
		}
		
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("done");
	}
	@AfterTest
	public void closing()
	{
		System.out.println("success");
	}
}
