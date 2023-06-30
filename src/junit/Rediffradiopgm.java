package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiopgm {
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
	 Boolean gender=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]")).isEnabled();
	 if(gender)
		{
			System.out.println("Radio button is displayed");
		}
		
		else
		{
			System.out.println("Radio button is not displayed");
		}
 }
}


