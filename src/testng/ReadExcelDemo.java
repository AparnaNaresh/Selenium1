package testng;


import org.testng.Assert;
import org.testng.annotations.Test;

import lib.ReadExcel;

public class ReadExcelDemo {
		
	public static void main(String args[])
	{
	ReadExcel r = new ReadExcel("C:\\Users\\ndulam_in\\Desktop\\Aparna_Java\\TestData.xlsx");
	System.out.println(r.getData("Login", 1, 1));
	}
	
	
}
