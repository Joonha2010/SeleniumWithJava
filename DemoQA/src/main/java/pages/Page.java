package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	//scroll to end page
			public void scrollToEndPage() {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			}
		    public void scrollToElement(By locator) {
		    	WebElement element = driver.findElement(locator);
		    	JavascriptExecutor js = (JavascriptExecutor) driver;
		    	js.executeScript("arguments[0].scrollIntoView(true);", element);
		    
		    	
		    }
	
}
