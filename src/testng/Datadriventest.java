package testng;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1() throws Exception {
		FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\Luminar Software testing\\datadriventest.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");//sheet details
		int row=sh.getLastRowNum();//row details
		for(int i=1;i<=row;i++)
		{
			//if string user n pass
			//String username=sh.getRow(i).getCell(0).getStringCellValue();
			//String password=sh.getRow(i).getCell(1).getStringCellValue();
			
			//if string user n numeric pass
			//String username=sh.getRow(i).getCell(0).getStringCellValue();
			//double pswd=sh.getRow(i).getCell(1).getStringCellValue();
			//int p=(int)pswd;
			
			//or else use decision making as given below
			
			Cell username=sh.getRow(i).getCell(0);
			String user=getcellvalue(username);
			Cell password=sh.getRow(i).getCell(1);
			String pass=getcellvalue(password);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			System.out.println("username is "+user+" password is "+pass);
		}
		
	}
	private static String getcellvalue(Cell cell)
	{
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else if(cell.getCellType()==CellType.NUMERIC)
		{
			return String.valueOf((int)cell.getNumericCellValue());
			
		}
		else
			{
			return "";
			}
	}
	
	
}

