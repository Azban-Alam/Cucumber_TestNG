package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {

	public WebDriver driver;
	public LandingPageObjects landingPageObjects;
	public OfferPageObject offerPageObjectObject;

	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPageObjects getLandingPageObject() {
		landingPageObjects = new LandingPageObjects(driver);
		return landingPageObjects;
	}

	public OfferPageObject getOfferPageObject() {
		offerPageObjectObject = new OfferPageObject(driver);
		return offerPageObjectObject;
	}

}
