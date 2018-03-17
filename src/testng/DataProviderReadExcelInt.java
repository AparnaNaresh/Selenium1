//package testng;
//
//public class DataProviderReadExcelInt {
//
//}
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



public class DataProviderReadExcelInt {

	public XSSFWorkbook wb;
	public XSSFSheet sh;
	public WebDriver driver;
	
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws IOException
	{
		
		File f = new File("C:/Users/ndulam_in/Desktop/Aparna_Java/SeleniumJars/TestData.xlsx");
		
	
		FileInputStream fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(1);
		int rows = sh.getLastRowNum();
		int columns = sh.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows][columns];
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++)
			{
				Cell c = sh.getRow(i).getCell(j);
				data[i][j] = c.getNumericCellValue();
			}
		return data;
		
	
	}
	@Test(dataProvider="testdata")
	public void add(String num1, String num2, String num3)
	{
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = Integer.parseInt(num3);
		System.out.println(a+b+c);
	}
	
	
	
}

