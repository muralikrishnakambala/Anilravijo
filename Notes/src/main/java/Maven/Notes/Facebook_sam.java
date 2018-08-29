package Maven.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_sam 
{
    WebDriver driver;
    public void open()
    {
    	driver =new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    }
    public void login()
    {
    	driver.findElement(By.name("email")).sendKeys("murali.krishna1122@gmail.com");
    	driver.findElement(By.id("pass")).sendKeys("asdfasdfsdf");
    //	driver.findElement(By.id("u_0_2")).sendKeys(Keys.RETURN);
    	driver.findElement(By.id("u_0_2")).click();
    }
	public static void main(String[] args) 
	{
		// Facebook example
		Facebook_sam obj=new Facebook_sam();
		obj.open();
		obj.login();
	}

}
