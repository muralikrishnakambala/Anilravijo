package Maven.Notes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.WebClient;

public class Actions_sam 
{
    WebDriver fd;
    void open()
    {
    	fd=new FirefoxDriver();
    	fd.manage().window().maximize();
    	fd.get("https://www.flipkart.com/");
    }
    void actions_method()
    {
    	fd.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    	WebElement w=fd.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
    	new Actions(fd).moveToElement(w).perform();
    	fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	fd.findElement(By.linkText("Mobiles")).click();
    	//WebElement w1=fd.findElement(By.xpath("//a[@title='Mobiles']"));
    	//new Actions(fd).moveToElement(w1).click();
    	//new Actions(fd).perform();
    }
	public static void main(String[] args) 
	{
		// Actions class example
		Actions_sam obj1=new Actions_sam();
		obj1.open();
		obj1.actions_method();
	}

}
