package testng;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerpgm {

	WebDriver driver;
	String baseurl="https://www.expedia.com/";
	@BeforeTest
	public void beftest()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void setup()
	{
		driver.get(baseurl);
	}

	@Test
	public void testlogin()
	{
		driver.findElement(By.id("d1-btn")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
			String month1=month.getText();
			if(month1.equals("July 2023")) {
				System.out.println(month1);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			}
		}
		List<WebElement> alldates1=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[5]/div[1]/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
		for(WebElement dates:alldates1) {
			String date=dates.getAttribute("data-day");
			//System.out.println(date);
			if(date.equals("14"))
			{
				dates.click();
				System.out.println("date selected");
				break;
			}
		}
	}
	
	
	@AfterMethod
	public void browserclose()
	{
		System.out.println("end");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("close");
	}
}
