package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterizationpgm {
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.com");
		}
	
	@Parameters("search") //for single parameter
	@Test
	public void test1(String s)
	{
		driver.findElement(By.name("q")).sendKeys(s);
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod done");
		}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest done");
		}

}
