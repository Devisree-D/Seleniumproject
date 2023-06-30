package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpg {

	WebDriver driver;
	By fbemail=By.id("email");
	By fbpswd=By.id("pass");
	By fblogin=By.name("login");
	
	public Fbloginpg(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String user,String pass)
	{
		driver.findElement(fbemail).sendKeys(user);
		driver.findElement(fbpswd).sendKeys(pass);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}
}
