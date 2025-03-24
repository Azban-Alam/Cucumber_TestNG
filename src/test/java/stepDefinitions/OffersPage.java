package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import PageObjects.OfferPageObject;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;

public class OffersPage {

//	WebDriver driver;
//	public String LandingProductName;
	public String OfferProductName;
	TextContextSetup textContext;

	public OffersPage(TextContextSetup textContext) {
		this.textContext = textContext;
	}

	@Then("^User searched for (.+) shortname on offers page$")
	public void user_searched_for_same_shortname_on_offers_page(String string)
			throws InterruptedException, IOException {
		OfferPageObject opObject = textContext.pageObjectsManager.getOfferPageObject(); // Offer Page Object Creation
		opObject.clickLink(); // Click "Top Link"
		List<String> list = new ArrayList<String>(textContext.tbObject.WebDriverManager().getWindowHandles());
		String pwhs = list.get(0);
		String cwhs = list.get(1);

		// SwitchTo Child Window
		textContext.tbObject.WebDriverManager().switchTo().window(cwhs);

		opObject.serachItems(string); // Search String
		Thread.sleep(5000);
		OfferProductName = opObject.getOfferProductName().trim(); // get Offers Product Name From Table
	}

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() throws IOException, InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(textContext.LandingProductName, OfferProductName);
		textContext.tbObject.WebDriverManager().close();
	}
}
