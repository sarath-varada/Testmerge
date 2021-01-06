// In first_class program, we had given multiple reference variables like driver, driver1...etc. 
//Now we're implementing polymorphism concept to minimize reference variable

package learningproject_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium_Browser_Launch_Sencond_Class {

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\vsarathkumar\\Desktop\\seleniumjars\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		  
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\vsarathkumar\\Desktop\\seleniumjars\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		  
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\vsarathkumar\\Desktop\\seleniumjars\\Drivers\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://www.myntra.com");
		driver.quit();
		  
	}

}
