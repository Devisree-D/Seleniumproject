package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpg;

public class Fblogintst extends Baseclasstst{
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
		Fbloginpg ob=new Fbloginpg(driver);
		ob.setvalues("abc@gmail.com", "12345");
		ob.login();
	}
}
