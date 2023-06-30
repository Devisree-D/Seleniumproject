package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {

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
	 WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	 Select daydetails=new Select(day);
	 daydetails.selectByIndex(14);
	 List<WebElement>lidat=daydetails.getOptions();
	 System.out.println("count of days "+(lidat.size()-1));
	 
	 WebElement mon=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	 Select mondetails=new Select(mon);
	 mondetails.selectByVisibleText("JUL");
	 List<WebElement>limon=mondetails.getOptions();
	 System.out.println("count of months "+(limon.size()-1));
	 
	 WebElement yr=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	 Select yrdetails=new Select(yr);
	 yrdetails.selectByValue("2023");
	 List<WebElement>liyr=yrdetails.getOptions();
	 System.out.println("count of years "+(liyr.size()-1));
 }
}
