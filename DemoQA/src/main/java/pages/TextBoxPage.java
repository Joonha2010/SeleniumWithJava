package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends Page{
By txtFullName = By.id("userName");
By txtEmail = By.id("userEmail");
By txtCurrentAddress = By.id("currentAddress");
By txtPermanentAddress = By.id("permanentAddress");
By txtsubmit = By.id("submit");
	public TextBoxPage(WebDriver dr) {
		super(dr);
		
	}
	

	public void submitData(String fullName, String email, String currentAddress, String permanentAddress ) {
		driver.findElement(txtFullName).sendKeys(fullName);
		zoomOut();
		//scrollToElement(By.id("submit"));
		driver.findElement(txtEmail).sendKeys(email);
		driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
		driver.findElement(txtPermanentAddress).sendKeys(permanentAddress);
		driver.findElement(txtsubmit).click();
		
}
	


}

