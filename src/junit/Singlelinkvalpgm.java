package junit;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singlelinkvalpgm {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	
	public void responsecode()
	{
		try {
			
			URL u =new URL(baseurl);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			System.out.println(con.getResponseCode());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
