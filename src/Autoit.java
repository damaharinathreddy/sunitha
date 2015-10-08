import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("C:\\Users\\s1\\Desktop\\Testing.html");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("id")).clear();
		
		driver.findElement(By.name("id")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\s1\\Desktop\\Randel.exe");
		
		Thread.sleep(2000);
		

	}

}
