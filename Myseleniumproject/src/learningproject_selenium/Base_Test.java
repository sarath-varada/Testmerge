package learningproject_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base_Test 
{
	
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static String properties_file_path= projectPath + "//data.properties";
	public static Properties p;
	
	public static void init() throws IOException
	{
		FileInputStream fis=new FileInputStream(properties_file_path);
		p=new Properties();
		p.load(fis);
	}
	public static void launch(String browser)
	{
		if (p.getProperty(browser).equalsIgnoreCase("chrome"))
		{
				System.setProperty("webdriver.chrome.driver", projectPath+"//Drivers//chromedriver.exe");
				driver=new ChromeDriver(); 	
		}
		else if (p.getProperty(browser).equalsIgnoreCase("firefox"))
		{
				System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers//geckodriver.exe");
				driver=new FirefoxDriver();	
		}
		else if (p.getProperty(browser).equalsIgnoreCase("ie"))		{
				System.setProperty("webdriver.ie.driver", projectPath+"//Drivers//IEDriverServer.exe");
				driver=new InternetExplorerDriver();		
		}
}
	public static void navigateurl(String url) 
	{
		driver.get(p.getProperty(url));
		
	}
}