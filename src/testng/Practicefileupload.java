package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practicefileupload {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urloading() {
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\DELL\\Desktop\\Luminar Software testing\\fileupload_demoword.docx");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
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
