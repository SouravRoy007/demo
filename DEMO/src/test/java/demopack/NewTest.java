package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("driver.gecko.driver",System.getProperty("users.dir")+"\\Selenium\\geckodriver.exe");
	  
	  WebDriver d=new FirefoxDriver();
	  
	  d.manage().window().maximize();
	  
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  d.get("https://www.facebook.com");
	  
	  WebElement e1=d.findElement(By.xpath("//*[@id=\"email\"]"));
	  
	  e1.sendKeys("hgmnnmn");
	  
	  WebElement e2=d.findElement(By.partialLinkText("password?"));
	  
	  e2.click();
	  
	  
	  
	  
  }
}
