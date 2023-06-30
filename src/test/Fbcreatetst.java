package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbcreatepg;

public class Fbcreatetst extends Baseclasstst{

//	WebDriver driver;
//	@BeforeTest
//	public void setup()
//	{
//		driver=new ChromeDriver();
//	}
//	@BeforeMethod
//	public void urlloading()
//	{
//		driver.get("https://www.facebook.com");
//	}
	@Test
	public void fbtest()
	{
		Fbcreatepg obj=new Fbcreatepg(driver);
		obj.createpageclick();
		obj.getstartedclick();
	}
}
