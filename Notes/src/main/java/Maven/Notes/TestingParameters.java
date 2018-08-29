package Maven.Notes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingParameters {
	 
	private static WebDriver driver;
 
  @Test 
 
  @Parameters({ "sUsername", "sPassword" })
 
  public void test(String sUsername, String sPassword) {
 
	  driver = new FirefoxDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("https://login.yahoo.com/");
 
      driver.findElement(By.id("login-username")).sendKeys("murali_kambala");
      driver.findElement(By.name("signin")).click();
  	//Thread.sleep(1000);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("login-passwd")).sendKeys("123selenium");
      driver.findElement(By.name("verifyPassword")).click();
 
      driver.quit();
 
  }
 
}
