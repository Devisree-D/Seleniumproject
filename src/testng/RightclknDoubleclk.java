package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightclknDoubleclk {

ChromeDriver driver;
	
	@BeforeTest()
	public void setup()
	{
		driver=new ChromeDriver();
		}

	@BeforeMethod()
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		}
	@Test()
	public void btntxtdisplay()
	{
		Actions act=new Actions(driver);
		WebElement rightclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(rightclk);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]/span")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement dblclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dblclk);
		act.perform();
		Alert a1=driver.switchTo().alert();
		String txt=a1.getText();
		a1.getText();
		System.out.println(txt);
		a1.accept();
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
