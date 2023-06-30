package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlerpgm {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urloading() {
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test1()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title is "+parentwindow);
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td/h2")).getText();
				System.out.println(s);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
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
