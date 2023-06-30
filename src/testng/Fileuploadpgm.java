package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {

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
	public void test1() throws AWTException
	{
	fileUpload("C:\\Users\\DELL\\Desktop\\Luminar Software testing\\fileupload_demoword.docx");
	}
	public void fileUpload(String p) throws AWTException {
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
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
