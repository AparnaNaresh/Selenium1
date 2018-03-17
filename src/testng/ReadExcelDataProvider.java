package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ReadExcelDataProvider {

	public XSSFWorkbook wb;
	public XSSFSheet sh;
	public WebDriver driver;
	
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws IOException
	{
		
		File f = new File("C:/Users/ndulam_in/Desktop/Aparna_Java/SeleniumJars/TestData.xlsx");
		
	
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0);
		int rows = sh.getLastRowNum();
		int columns = sh.getRow(0).getLastCellNum();
		String data[][] = new String[rows][columns];
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
			{
				Cell c = sh.getRow(i).getCell(j);
				data[i][j] = c.getStringCellValue();
			}
		return data;
		
	
	}
	@Test(dataProvider="testdata")
	public void loginFunctionality(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/index.php");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button#tdb1")).click();
		String actualURl =driver.getCurrentUrl();
		Assert.assertEquals(actualURl, "http://www.gcrit.com/build3/admin/index.php");
		
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
}
