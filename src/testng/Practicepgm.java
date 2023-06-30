package testng;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Practicepgm {

	WebDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get(baseurl);
	}
	@Test
	public void test1() throws Exception{
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		String cnturl=driver.getCurrentUrl();
		URL n=new URL(cnturl);
		HttpURLConnection con=(HttpURLConnection)n.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			con.getResponseMessage();
			System.out.println("pass "+con.getResponseCode());
		}
		else {
			con.getResponseMessage();
			System.out.println("fail "+con.getResponseCode());
		}
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("finished");
	}
	@AfterTest
	public void teardown() {
		System.out.println("done");
	}
}
