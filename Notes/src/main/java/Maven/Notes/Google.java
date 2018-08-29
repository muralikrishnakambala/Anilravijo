package Maven.Notes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Google 
{
    WebDriver driver;
    @Test
    @org.testng.annotations.Parameters({"browser"})
    public void open(String browser)
    {
    	if(browser.matches("ff"))
    	{
    		driver = new FirefoxDriver();
    	}
    	if(browser.matches("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe");
    		driver=new ChromeDriver();
    	}
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    }
}
