package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
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
@Test(priority=3)
public void titleverification()
{
	String title=driver.getTitle();
	if(title.equalsIgnoreCase("Google"))
	{
		System.out.println("title correct");
	}
	else
	{
		System.out.println("title wrong");
	}
	
	}
@Test(priority=1,invocationCount=2,enabled=false )
public void textcontain()
{
	String src=driver.getPageSource();
	if(src.contains("Gmail"))
	{
		System.out.println("text correct");
	}
	else
	{
		System.out.println("text wrong");
	}
	}
@Test(priority=2)
public void logodisplay()
{
	Boolean logopresent=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	if(logopresent)
	{
		System.out.println("logo correct");
	}
	else
	{
		System.out.println("logo wrong");
	}
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
