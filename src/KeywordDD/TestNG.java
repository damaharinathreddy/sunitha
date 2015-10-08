package KeywordDD;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeMethod
	public void startup()
	{
//		System.out.println("asdj");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void startup2()
	{
		System.out.println("f 32");
	}

}
