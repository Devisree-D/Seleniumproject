package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertexample {
ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		}
	
	@Test
	public void test1() {
		SoftAssert soft=new SoftAssert();
		Boolean exp=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isDisplayed();
		Boolean act=false;
		soft.assertEquals(act, exp);
		soft.assertAll();
		System.out.println("success");
	}
	
}
