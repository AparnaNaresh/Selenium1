package propertiesfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestBase {
	public WebDriver driver;
	public Properties pr;
	public File f;
	public FileReader fr;
	public void setUp() throws IOException
	{
		
		pr = new Properties();
		f=new File(System.getProperty("user.dir")+"/Configuration/config.properties");
		fr = new FileReader(f);
		pr.load(fr);
		
		f=new File(System.getProperty("user.dir")+"/Configuration/objectrep.properties");
		fr = new FileReader(f);
		pr.load(fr);
		
	}
	
	@BeforeClass
	public void init() throws IOException
	{
		setUp();
	}
	@AfterTest
	public void logout()
	{
		driver.close();
	}
}
