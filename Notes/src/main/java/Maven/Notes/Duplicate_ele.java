package Maven.Notes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Duplicate_ele 
{
    FirefoxDriver d;
    void open()
    {
    	d=new FirefoxDriver();
    	d.manage().window().maximize();
    	d.get("https://mail.yahoo.com/");
    }
    void login()
    {
    	d.findElement(By.name("username")).sendKeys("murali_kambala");
    	d.findElement(By.name("signin")).click();
    	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	d.findElement(By.name("password")).sendKeys("123selenium");
    	d.findElement(By.name("verifyPassword")).click();    	
    }
    void mail()
    {
    	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	d.findElement(By.xpath("//button[@class='c27KHO0_n b_0 M_0 i_0 I_T y_Z2uhb3X A_6EqO r_P C_q cvhIH6_T ir3_1JO2M7 P_eo6 H_6D6F']")).click();
    }
    
	public static void main(String[] args) 
	{
		// Duplicate element identifier
		Duplicate_ele o=new Duplicate_ele();
		o.open();
		o.login();
		o.mail();
	}

}
