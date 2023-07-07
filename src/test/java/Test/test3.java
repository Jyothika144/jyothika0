package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.pageclass;

public class test3 {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	}
	
@Test
public void fliptest() {
	pageclass ob=new pageclass(driver);
}
	
}

}
