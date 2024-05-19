package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Page {
	WebDriver driver;
	//constructor Gans driver trong tc vaof tuwngf page

	public Page(WebDriver dr) {
		this.driver = dr;
	}
	public void zoomOut () {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.body.style.zoom = '50%'");
	}
	
}
