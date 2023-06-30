package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidation {

ChromeDriver driver;
	
	@BeforeTest()
	public void setup()
	{
		driver=new ChromeDriver();
		}

	@BeforeMethod()
	public void urlloading()
	{
		driver.get("https://prod-auth.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F&response_type=code");
		}
	@Test()
	public void test1()
	{
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
	driver.findElement(By.xpath("//*[@id=\"kc-login\"]")).click();
	String wronglink=driver.getCurrentUrl();
	if(wronglink.equals("https://prod-auth.cloud.utest.com/auth/realms/applause/login-actions/authenticate?execution=ec5dddbb-7669-40b4-af9c-c6c2ee5f7c6a&client_id=utestv2&tab_id=d4_OC1DdW70"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
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
