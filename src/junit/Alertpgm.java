package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("C:\\Users\\DELL\\Desktop\\Luminar Software testing\\alert.html");
		
	}
	@Test
	
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("joe");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("john");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}

}
