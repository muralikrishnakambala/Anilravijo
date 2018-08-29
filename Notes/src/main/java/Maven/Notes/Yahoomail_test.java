package Maven.Notes;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Yahoomail_test
{
    
	WebDriver d;
	@Test
	
	public void show() throws Exception
    {
    	
    	FileInputStream fs=new FileInputStream("C:\\Users\\MURALISWAPNA\\Desktop\\Softwares\\Yahoomail_ddt.xls");
    	Workbook wb=Workbook.getWorkbook(fs);
    	Sheet ws=wb.getSheet("Samplesheet");
    	for(int r=0;r<ws.getRows();r++)
    	{
    		d=new FirefoxDriver();
    		d.manage().window().maximize();
        	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	d.get("http://www.yahoomail.com/");
        	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    		d.findElement(By.name("username")).sendKeys(ws.getCell(0, r).getContents());
    		d.findElement(By.name("signin")).click();
    		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    		d.findElement(By.id("login-passwd")).sendKeys(ws.getCell(1,r).getContents());
    		d.findElement(By.id("login-signin")).click();
    		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    		try
    		{
    			if(d.findElement(By.xpath("//span[@class='_yb_s9olo _yb_mkqqq _yb_1hd4i _yb_1367m _yb_rrzf1']")).isDisplayed())
    			{
    				System.out.println("Login is success");
    				d.findElement(By.xpath("//span[@class='_yb_s9olo _yb_mkqqq _yb_1hd4i _yb_1367m _yb_rrzf1']")).click();
    				d.findElement(By.xpath("//span[@class='_yb_rrzf1 _yb_m5dik _yb_1hd4i']")).click();
    				//d.findElement(By.name("targetId")).click();
    				d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    			}
    		}
    		catch(Exception e)
    		{
    			String str=d.findElement(By.xpath("//p[@class='error-msg']")).getText();
    			System.out.println("Login is failed"+str);
    		}  
    		finally
    		{
    			System.out.println("next step");
    		}
    		d.close();
    	}
    }

    
}

