package KeywordDD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
                    
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeywordTest {
FirefoxDriver driver;
@BeforeMethod
	public void startup()
	{
		driver =new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	}
@Test
	public void StartupKDD() throws IOException, InterruptedException
	{
	 FileInputStream fi = new FileInputStream("D:\\aditya\\Selenium\\KeyDD.properties");
	 Properties pr = new Properties();
	 pr.load(fi);
	 driver.findElement(By.id(pr.getProperty("txtusername"))).sendKeys("ddraj32");
	 driver.findElement(By.id(pr.getProperty("btnnext"))).click();
	 Thread.sleep(1000);
	 driver.findElement(By.id(pr.getProperty("txtpassword"))).sendKeys("adi1234");
	 driver.findElement(By.id(pr.getProperty("btnsigin"))).click();
	 
	}
}
