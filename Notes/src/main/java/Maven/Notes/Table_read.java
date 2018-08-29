package Maven.Notes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_read 
{
    FirefoxDriver driver;
    void open()
    {
    	driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
 	 }
    void table()
    {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	//driver.findElement(By.linkText("Daily Share Prices")).click();
    	for(int r=10;r<=19;r++)
    	{
    	String str=driver.findElement(By.xpath("//td[@id='tdStock"+r+"']")).getText();
    	System.out.println(str);
    	}
    }
    	
    
	public static void main(String[] args) 
	{
		// Reading data from the table
		Table_read obj=new Table_read();
		obj.open();
		obj.table();
	}

}
