package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pageclass {
 WebDriver driver;
 By flipsearch=By. name("q");
 By ram=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[7]/div[2]/div/div/div/label/div[1]");
 By image=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[1]/div/div/img");
 
 
 public pageclass(WebDriver driver) {
	  this.driver =driver;
	  
 }
 public void setvaluessetvalues()
 {
 driver.findElement(flipsearch).sendKeys("iphone");
 driver.findElement(image).sendKeys( Keys.ENTER);
  
 driver.findElement(ram).click();
 driver.findElement(image).click();
}

 public void addcart() {
	 
	 driver.findElement(addcart()).click();
 }
}