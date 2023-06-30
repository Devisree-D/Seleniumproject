package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkavailability {
ChromeDriver driver;
	
	@BeforeTest()
	public void setup()
	{
		driver=new ChromeDriver();
		}

	@BeforeMethod()
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		}
	@Test()
	public void btntxtdisplay()
	{
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		//String txt=btn.getText();
		String atr=btn.getAttribute("value");
		if(atr.equalsIgnoreCase("check availability"))
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("wrong");
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
