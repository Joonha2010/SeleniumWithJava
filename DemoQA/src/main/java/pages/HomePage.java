package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page{
	
	public By lblElement =By.xpath("//h5[text()='Elements']");
				
	public HomePage(WebDriver dr) {
		super(dr);  
	}

	public ElementsPage clickElements () {
		ElementsPage result = new ElementsPage(driver);
		scrollToElement();
		driver.findElement(lblElement).click();	
		/*8 cach xac dinh locator
		 * Thu tu uu tien Id-> name -> Textlink |partiaLinkText|
		 */
		return result;
		/*<span class="text">Text Box</span>*/
			
		}

	public void scrollToElement () {
		WebElement element = driver.findElement(lblElement);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	}
	



/*4 tinh chat huong doi tuong trong java da hinh,Truu tuong, ke thua, tinh dong' goi'*/
