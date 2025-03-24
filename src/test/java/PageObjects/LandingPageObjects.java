package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObjects {

	WebDriver driver;

	By search = By.xpath("//input[@class='search-keyword']");
	By productName = By.xpath("//h4[@class='product-name']");

	public LandingPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public void searchItems(String name) {
		driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(name);
	}

	public void getSearchText(String name) {

		driver.findElement(search).getText();
	}

	public String getProductName(String name) {

		return driver.findElement(productName).getText();
	}

}
