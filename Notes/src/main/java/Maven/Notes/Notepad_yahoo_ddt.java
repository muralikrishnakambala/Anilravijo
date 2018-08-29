package Maven.Notes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Notepad_yahoo_ddt 
{
    FirefoxDriver d;
    void open()
    {
    d=new FirefoxDriver();
    d.manage().window().maximize();
    d.get("http://www.yahoomail.com/");
    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    public void login() throws Exception
    {
    	String str,a[];
    	FileReader fr=new FileReader("C:\\Users\\MURALISWAPNA\\Desktop\\Softwares\\ddt.txt");
    	BufferedReader br=new BufferedReader(fr);
    	while((str=br.readLine())!= null)
    	{
    		a=str.split(",");
    		open();
    		d.findElement(By.name("username")).sendKeys(a[0]);
    		d.findElement(By.name("signin")).click();
    		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    		d.findElement(By.id("login-passwd")).sendKeys(a[1]);
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
    			String str1=d.findElement(By.xpath("//p[@class='error-msg']")).getText();
    			System.out.println("Login is failed"+str1);
    		}  
    		finally
    		{
    			System.out.println("next step");
    		}
    		d.close();
    	}
    }
	public static void main(String[] args) throws Exception
	{
		// Notepad yahoo ddt
		Notepad_yahoo_ddt obj=new Notepad_yahoo_ddt();
		obj.login();
	}

}
