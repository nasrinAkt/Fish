package Fish_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Fish_PageLocator.Fish_AboutUsPageLocator;
import Fish_Utility.Fish_Base;

public class Fish_AboutUsPageAction extends Fish_Base{
	Fish_AboutUsPageLocator fish_AboutUsPageLocator = new Fish_AboutUsPageLocator();
	
	public void Verifyuserinaboutuspage() throws Exception {
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
		Thread.sleep(3000);
	boolean veri = fish_AboutUsPageLocator.verify.isDisplayed();
	Assert.assertTrue(veri);
	
	}
	
	
}
