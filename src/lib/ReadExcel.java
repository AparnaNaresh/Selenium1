package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel
{ 
	 public XSSFWorkbook wb;
	 public XSSFSheet sh;
	
	
	public ReadExcel(String filepath ) 
	{
		File f = new File(filepath);
		try {
			FileInputStream fis = new FileInputStream(f);
					
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public String getData(String SheetNumber, int rowNum, int colNum)
	{
		sh=(XSSFSheet) wb.getSheet(SheetNumber);
		String data = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		return data;
		
	}
	
	public int  getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row= row+1;
		return row;
	}
}
