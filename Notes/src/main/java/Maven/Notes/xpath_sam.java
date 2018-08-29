package Maven.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath_sam 
{
    FirefoxDriver d;
    public void open()
    {
    d=new FirefoxDriver();
    d.manage().window().maximize();
    d.get("https://www.facebook.com/");   
    }
    public void login()throws Exception
    {
    	d.findElement(By.id("email")).sendKeys("murali.krishna1122@gmail.com");
    	//Thread.sleep(30000);  // wait for sometime to execute next stmt
    	d.findElement(By.name("pass")).sendKeys("asdfasdfsdf");
    	d.findElement(By.id("u_0_2")).click();
    }
    public void read()throws Exception
    {
    String str=	d.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
    System.out.println(str);
    }
	public static void main(String[] args) throws Exception
	{
		// xpath example using facebook
     xpath_sam obj=new xpath_sam();
     obj.open();
     obj.login();
     obj.read();
	}

}
