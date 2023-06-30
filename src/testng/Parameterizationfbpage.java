package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizationfbpage {

ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
		}
	
	@Parameters({"user","pass"}) //for single parameter
	@Test
	public void test1(String u,String p)
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(u);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(p);
		driver.findElement(By.name("login")).click();
		String wronglink=driver.getCurrentUrl();
		String act="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg3MTAxNDE0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		if(wronglink.equals(act))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
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
