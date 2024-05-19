package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends Page {
	public ElementsPage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}

	public TextBoxPage clickTextBoxMenu() {
		TextBoxPage textBoxPage = new TextBoxPage(driver);
		driver.findElement(By.xpath("//span[text()='Text Box']/..")).click();
		return textBoxPage;
	
}
	
}
