package Maven.Notes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class yahoo_sam 
{
    FirefoxDriver f;
    void open()
    {
    f=new FirefoxDriver();
    f.manage().window().maximize();
    f.get("https://login.yahoo.com/");
    }
    void login() throws Exception
    {
    	f.findElement(By.id("login-username")).sendKeys("murali_kambala");
    	f.findElement(By.name("signin")).click();
    	//Thread.sleep(1000);
    	f.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	f.findElement(By.id("login-passwd")).sendKeys("123selenium");
    	f.findElement(By.name("verifyPassword")).click();
    }
    void logo() throws Exception
    {
    	WebDriverWait wt= new WebDriverWait(f,30);
    	wt.until(ExpectedConditions.invisibilityOfElementLocated(By.id("uh-logo")));
    	String str=f.findElement(By.id("uh-logo")).getText();
    	System.out.println(str);
    }
	public static void main(String[] args) throws Exception 
	{
		// Yahoo example for synchronization
		yahoo_sam obj=new yahoo_sam();
		obj.open();
		obj.login();
		obj.logo();
	}

}
