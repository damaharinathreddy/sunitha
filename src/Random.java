import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Random {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://www.seleniumhq.org");
		
		driver.findElement(By.linkText("Download")).click();
		
		//driver.findElement(By.linkText("2.47.1")).click();
		
		//java.lang.Runtime.getRuntime().exec("C:\\Users\\s1\\Desktop\\selenium.exe");
		
		//Thread.sleep(1000);
		
		

	}

}
