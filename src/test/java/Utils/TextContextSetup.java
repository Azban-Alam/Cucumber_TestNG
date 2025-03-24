package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectsManager;

public class TextContextSetup {

	public WebDriver driver;
	public String LandingProductName;
	public PageObjectsManager pageObjectsManager;
	public TestBase tbObject;
	public GenericUtils genericUtilsObj;

	public TextContextSetup() throws IOException {
		tbObject = new TestBase();
		pageObjectsManager = new PageObjectsManager(tbObject.WebDriverManager());
		genericUtilsObj = new GenericUtils(tbObject.WebDriverManager());
	}

}
