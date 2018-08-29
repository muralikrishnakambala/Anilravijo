package Maven.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_sam 
{
    FirefoxDriver driver;  // browser driver object declaration
    public void open()
    {
    driver=new FirefoxDriver();  // intialized an object called driver
    driver.manage().window().maximize(); // firefox browser window maximized
    driver.get("https://www.google.co.in/"); // enter url     
    }
    public void search()
    {
     driver.findElement(By.id("lst-ib")).sendKeys("selenium");
     driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
    }
	public static void main(String[] args)
	{
		// Google search
		Google_sam obj=new Google_sam();
		obj.open();
		obj.search();
	}

}
