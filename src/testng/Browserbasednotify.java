package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browserbasednotify {

ChromeDriver driver;
	
	@BeforeTest()
	public void setup()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver=new ChromeDriver(op);
		}

	@BeforeMethod()
	public void urlloading()
	{
		driver.get("http://www.justdial.com/");
		}
	@Test()
	public void test1()
	{
		System.out.println("pass");
	}
	@AfterMethod()
	public void aftermethod()
	{
		System.out.println("aftermethod done");
		}
	@AfterTest()
	public void aftertest()
	{
		System.out.println("aftertest done");
		}
}
