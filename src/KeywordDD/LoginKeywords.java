package KeywordDD;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords {
	FirefoxDriver driver;
	public void LauntcBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void Navigate()
	{
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	}
	public void EnterUserName()
	{
		driver.findElement(By.id("Email")).sendKeys("ddraj32");
	}
	public void Clicknext() throws InterruptedException
	{
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);
	}
	public void EnterPassword()
	{
		driver.findElement(By.id("Passwd")).sendKeys("adi123");
	}
	public void ClickiLogin()
	{
		driver.findElement(By.id("signIn")).click();
	}
}
