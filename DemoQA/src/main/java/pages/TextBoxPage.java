package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends Page{

	
	public TextBoxPage(WebDriver dr) {
		super(dr);
		
	}
	
	public void submitData() {
		driver.findElement(By.id("userName")).sendKeys("Hà");
	
		driver.findElement(By.id("emailName")).sendKeys("ha@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("HaNOi");
		driver.findElement(By.id("permanentAddress")).sendKeys("Vietnam");
		driver.findElement(By.id("submit")).click();
		
}


}
