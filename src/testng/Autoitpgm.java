package testng;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitpgm {

ChromeDriver driver;
	
	@BeforeTest()
	public void setup()
	{
		driver=new ChromeDriver();
		}

	@BeforeMethod()
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		}
	@Test()
	public void test1() throws IOException, Exception
	{
	
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\Luminar Software testing\\t1.exe");
		Thread.sleep(3000);}
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
