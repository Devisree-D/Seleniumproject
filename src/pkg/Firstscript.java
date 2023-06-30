package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Firstscript {

	public static void main(String[] args) {
		
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com");
		String actualtitle=Driver.getTitle();
		String exp="Google";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("PASS");
		}
		else
		
		
		{
			System.out.println("FAIL");
		}
	}

}
