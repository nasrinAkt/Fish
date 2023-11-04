package Fish_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fish_Utility.Fish_Base;

public class Fish_AboutUsPageLocator extends Fish_Base{


	public Fish_AboutUsPageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath ="//h1[text()='Address']")
	public WebElement verify;
	
	
	
}
