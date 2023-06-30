package junit;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fliplinkvali {
	ChromeDriver driver;
	 String baseurl="http://www.flipkart.com";
	 @Before
	 
	 public void setUp()
	 {
		 
		 driver=new ChromeDriver();
		 driver.get(baseurl);
	 } 
	 @Test
	 public void linkvalidation()
	 {
		 List<WebElement>li=driver.findElements(By.tagName("a"));
		 System.out.println("Number of links="+li.size());
		 for(WebElement element:li)
		 {
			 String link=element.getAttribute("href");
			 verify(link);
		 }
	 }

	public void verify(String link) {
		try {
			URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200) {
			System.out.println("Successfull----"+link);
		}
		else if(con.getResponseCode()==400)
{
			
		
			System.out.println("Broken link---"+link);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
