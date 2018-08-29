package Maven.Notes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

public class Debug_Chrome 
{
	@Listeners({ ATUReportsListener.class, ConfigurationListener.class,
		  MethodListener.class })
		public class TestNGScript {


		       //Set Property for ATU Reporter Configuration
		       {
		         System.setProperty("atu.reporter.config", "C:\\Users\\MURALISWAPNA\\Desktop\\Softwares\\ATUReporter_Selenium_testNG_2.1 jar+javadoc+prop file+demo proj+atu recorder\\atu.properties");
		       }
	WebDriver driver;
	@Test
	
	public void main1 ()
	{
	    System.out.println("Debug 1");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MURALISWAPNA\\Desktop\\Softwares\\chromedriver.exe"); 
	    System.out.println("Debug 2");
	    driver = new ChromeDriver();
	    System.out.println("Debug 3");
	    driver.get("http://www.google.com");
	    driver.quit();
	}
}
}
