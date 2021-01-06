package learningproject_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

// Setting drivers via script.
public class Selenium_Browser_Launch_First_Class {

	public static void main(String[] args) 
	{
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\vsarathkumar\\Desktop\\seleniumjars\\Drivers\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver(); 
		  driver.get("https://www.amazon.in");
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\vsarathkumar\\Desktop\\seleniumjars\\Drivers\\geckodriver.exe");
		  FirefoxDriver driver1=new FirefoxDriver();
		  driver1.get("https://www.flipkart.com");
		  
		  System.setProperty("webdriver.ie.driver", "C:\\Users\\vsarathkumar\\Desktop\\seleniumjars\\Drivers\\IEDriverServer.exe");
		  InternetExplorerDriver driver2=new InternetExplorerDriver();
		  driver2.get("https://www.myntra.com");
		  
		  driver.quit();
		  driver1.quit();
		  driver2.quit();
		  
		 
		
		

	}

}
