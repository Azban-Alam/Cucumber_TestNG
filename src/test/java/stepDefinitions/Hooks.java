package stepDefinitions;

import java.io.IOException;

import Utils.TextContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	TextContextSetup textContext;
	
	public Hooks(TextContextSetup textContext) {
		this.textContext = textContext;
	}
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario() throws IOException{
        
		textContext.tbObject.WebDriverManager().quit();
    }

}
