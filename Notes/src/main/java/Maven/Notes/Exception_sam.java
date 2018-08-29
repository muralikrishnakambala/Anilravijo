package Maven.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exception_sam 
{
    FirefoxDriver f;
    void open()
    {
    f=new FirefoxDriver();
    f.manage().window().maximize();
    f.get("https://login.yahoo.com/");
    }
    void login() 
    {
    	f.findElement(By.id("login-username")).sendKeys("murali_kambala");
    	f.findElement(By.name("signin")).click();
    	try
    	{
    	Thread.sleep(1000);
    	}
    	catch(Exception e)
    	{
    		System.out.println("This may throw exceptin"+e);
    	}
    	finally 
    	{
    		System.out.println("This ends program");
    	}
    	f.findElement(By.id("login-passwd")).sendKeys("123selenium");
    	f.findElement(By.name("verifyPassword")).click();
    }
    void logo() throws Exception
    {
    	
    	String str=f.findElement(By.id("uh-logo")).getText();
    	System.out.println(str);
    }
	public static void main(String[] args) throws Exception 
	{
		// Yahoo example for Exception
		Exception_sam obj=new Exception_sam();
		obj.open();
		obj.login();
		obj.logo();
	}

}
