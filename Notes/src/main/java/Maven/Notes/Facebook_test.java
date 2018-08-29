package Maven.Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook_test
{
    WebDriver driver;
    @Test
    public void open()
    {
    	driver =new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.name("email")).sendKeys("murali.krishna1122@gmail.com");
    	driver.findElement(By.id("pass")).sendKeys("asdfasdfsdf");
    //	driver.findElement(By.id("u_0_2")).sendKeys(Keys.RETURN);
    	driver.findElement(By.id("u_0_2")).click();
    }
}
