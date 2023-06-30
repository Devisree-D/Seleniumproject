package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffpgm {
	
	ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
 @Test
 
 public void test()
 {
	Boolean logo= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	 ////img[@title='Rediff.com']
	if(logo)
	{
		System.out.println("Logo is displayed");
	}
	
	else
	{
		System.out.println("Logo is not displayed");
	}
	 
 }
 @Test
 
 public void test2()
 {
	Boolean gender=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
	if(gender)
	{
		System.out.println("Gender is selected");
	}
	else
	{
		System.out.println("Gender is not selected");
	}}
	@Test
	
	public void test3()
	{
Boolean button=driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();

if(button)
{
	System.out.println("Button is enabled");
	
}
else
{
	System.out.println("Button is not enabled");
}
}}
