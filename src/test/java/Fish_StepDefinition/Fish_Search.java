package Fish_StepDefinition;

import Fish_PageAction.Fish_AboutUsPageAction;
import Fish_PageAction.Fish_HomePageAction;
import Fish_Utility.Fish_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Fish_Search extends Fish_Base{

	Fish_HomePageAction fish_HomePageAction = new Fish_HomePageAction();
	Fish_AboutUsPageAction fish_AboutUsPageAction = new Fish_AboutUsPageAction();
	
	@Given("^open <\"([^\"]*)\"> sc$")
	public void open_sc(String URL) throws Throwable {
		LaunchURL(URL); 
	}
		
	

   @Then("^click on about us link$")
   public void click_on_about_us_link() throws Throwable {
	   fish_HomePageAction.clickonaboutuslink();
	
	
}

   @Then("^Verify user in about us page$")
   public void verify_user_in_about_us_page() throws Throwable {
	   fish_AboutUsPageAction.Verifyuserinaboutuspage(); 
	   
	   
   }



}
