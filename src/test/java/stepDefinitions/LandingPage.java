package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPageObjects;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPage {

	WebDriver driver;
	//public String LandingProductName;
	//public String OfferProductName;
	TextContextSetup textContext;

	public LandingPage(TextContextSetup textContext) {
		this.textContext = textContext;
	}

	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		
		textContext.tbObject.WebDriverManager().manage().window().maximize();
	}

	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string)
			throws InterruptedException {
		LandingPageObjects lpObject = textContext.pageObjectsManager.getLandingPageObject(); // Object Creation
		lpObject.searchItems(string); // Search ITeams
		Thread.sleep(2000);
		textContext.LandingProductName = lpObject.getProductName(string).split("-")[0].trim();
		System.out.println(textContext.LandingProductName + "Is Extracted From The Home Page");
	}

}
