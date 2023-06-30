package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Practicepgm1 {

	WebDriver driver;
	String baseurl="https://www.google.com";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoad() {
		driver.get(baseurl);
	}
	@Test
	public void test1() throws IOException {
		File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc,new File("C:\\Users\\DELL\\Desktop\\Luminar Software testing\\ss demo\\ss.png"));
	}
	
}
