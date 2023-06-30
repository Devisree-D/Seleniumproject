package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertpgm {

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
	
	@Test
	public void test1()
	{
		//hardassertion
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		String wronglink=driver.getCurrentUrl();
		String act="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg3MTAxNDE0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		Assert.assertEquals(wronglink, act);
		System.out.println("success");
		
		//softassertion 1
//				if(wronglink.equals(act))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		//soft assertion 2
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345");
//		driver.findElement(By.name("login")).click();
//		SoftAssert soft=new SoftAssert();
//		String exp=driver.getCurrentUrl();
//		String act="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg3MTU2NDc4LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
//		soft.assertEquals(act, exp, act);
//		soft.assertAll();
//		System.out.println("success");
	
		
		
		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod done");
		}
	@AfterTest
	public void teardown()
	{
		System.out.println("aftertest done");
		}

}
