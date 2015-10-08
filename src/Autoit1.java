import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	    WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.seleniumhq.org/download/");
		
		driver.findElement(By.linkText("2.47.1")).click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\s1\\Desktop\\selenium.exe");
		
		Thread.sleep(2000);

	}

}
