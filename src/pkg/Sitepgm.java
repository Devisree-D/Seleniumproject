package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sitepgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualtitle=driver.getTitle();
		String exp="Amazon";
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
