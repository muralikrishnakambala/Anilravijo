package Maven.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_sam 
{
    FirefoxDriver d;
    void open()
    {
    	d=new FirefoxDriver();
    	d.manage().window().maximize();
    	d.get("https://login.yahoo.com/");
    }
    void signup()
    {
    	d.findElement(By.xpath("//a[@id='createacc']")).click();
    	d.findElement(By.id("usernamereg-firstName")).sendKeys("Ravi5");
    	d.findElement(By.name("lastName")).sendKeys("Anil");
    	d.findElement(By.name("yid")).click();
    	d.findElement(By.name("yid")).sendKeys(Keys.ARROW_DOWN);
    	d.findElement(By.name("yid")).sendKeys(Keys.ENTER);
    	d.findElement(By.name("password")).sendKeys("123selenium");
    }
    void dropdown()
    {
    	new Select(d.findElement(By.name("shortCountryCode"))).selectByValue("IN");
    	d.findElement(By.name("phone")).sendKeys("8989898989");
    	new Select(d.findElement(By.name("mm"))).selectByVisibleText("August");	
    	d.findElement(By.name("dd")).sendKeys("03");
    	d.findElement(By.name("yyyy")).sendKeys("2017");
    	d.findElement(By.name("freeformGender")).click();
    	d.findElement(By.name("freeformGender")).sendKeys(Keys.ARROW_DOWN);
    	d.findElement(By.name("freeformGender")).sendKeys(Keys.ENTER);
    }
	public static void main(String[] args) 
	{
		// Yahoo signup for select drop down
		Signup_sam obj= new Signup_sam();
		obj.open();
		obj.signup();
		obj.dropdown();
	}

}
