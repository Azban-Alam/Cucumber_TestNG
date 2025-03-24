package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageObject {

	WebDriver driver;

	By searchItems = By.xpath("//input[@id='search-field']");
	By linkText = By.linkText("Top Deals");
	By offerProductName= By.xpath("//table[@class='table table-bordered']//tbody/tr/td[1]");

	public OfferPageObject(WebDriver driver) {
		this.driver = driver;

	}

	public void clickLink() {

		driver.findElement(linkText).click();
	}

	public void serachItems(String name) {
		driver.findElement(searchItems).sendKeys(name);
	}

	public String getOfferProductName() {
		return driver.findElement(offerProductName).getText();
	}
}
