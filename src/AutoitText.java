import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoitText {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver=new FirefoxDriver();
		
	driver.get("C:\\Users\\s1\\Desktop\\Demo1.txt");
		
	Runtime.getRuntime().exec("C:\\Users\\s1\\Desktop\\Demo1.exe");

	}

}
