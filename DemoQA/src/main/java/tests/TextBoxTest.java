package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest {
@Test
public void submitSuccessfully (){
	String fullname = "Ha";
	String email = "Hajoon@gmail.com";
	String currentAddress ="Vietnam"; 
	String permanentAddress = "Ha Noi";
	
	//Open browser
	String projectPath= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath +"\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	//Open website
	driver.get("https://demoqa.com/");/*Open homepage*/
	driver.manage().window().maximize();	/*maxiumm*/
	/*Create class HomePage.java and method clickElementfrom*/
	/*Click element Create method "clickElement()" in HomePage.java*/
	/*Ham co value return is class ElementPage.java (Vi click xong chuyen sang trang Eelements*/
	/*Create class "ElementsPage.java "*/
	
	//Click on Element on HOmepage
	HomePage homePage = new HomePage(driver);
	ElementsPage elementsPage= homePage.clickElements();

	TextBoxPage textBoxPage = elementsPage.clickTextBoxMenu();
	//Click on Element menu - redirect to TextBoxpage
	textBoxPage.submitData( fullname,  email,  currentAddress,  permanentAddress );
	//D:\Automation_Practice\02Project\Git\SeleniumWithJava\DemoQA\driver\chromedriver.exe
	
	}
}
