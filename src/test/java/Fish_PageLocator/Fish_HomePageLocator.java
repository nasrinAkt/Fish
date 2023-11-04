package Fish_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Fish_Utility.Fish_Base;

public class Fish_HomePageLocator extends Fish_Base{

	
	public Fish_HomePageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(linkText="About Us")
	public WebElement clAU;
}
