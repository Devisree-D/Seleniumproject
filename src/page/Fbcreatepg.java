package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Fbcreatepg {

	WebDriver driver;
	By createpglink=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstartedbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	By signupbtn=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fbcreatepg(WebDriver driver) {
		this.driver=driver;
	}
	public void createpageclick()
	{
		driver.findElement(createpglink).click();
	}
	public void getstartedclick()
	{
		driver.findElement(getstartedbtn);
		String txt=driver.findElement(signupbtn).getText();
		if(txt.equalsIgnoreCase("sign up"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
}
