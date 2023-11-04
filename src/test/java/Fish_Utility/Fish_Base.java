package Fish_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Fish_Base {

	public static WebDriver driver;
	public static Properties FiPro;
	
	
	public Fish_Base() {
	try {
		FileInputStream fiFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Fish_Config//Fish_Config.Properties"));	
		FiPro = new Properties(); 	
		FiPro.load(fiFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,check the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	public void FiBrowser() {
		
	String FiAllBrowser	= FiPro.getProperty("FiBrowser1");
	
	if(FiAllBrowser.equalsIgnoreCase("Chrome")) {
	System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Fish_ChromeDriver//chromedriver.exe"));	
	ChromeOptions yy = new ChromeOptions();
	yy.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Fish_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Fish_Utiliti.implicitlyWait));
	driver.manage().window().maximize();
	
	}
	
	else if(FiAllBrowser.equalsIgnoreCase("Edge")) {
	System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//Fish_EdgeDriver//msedgedriver.exe"));	
	EdgeOptions yy = new EdgeOptions();
	yy.addArguments("--remote-allow-origins=*");
	driver = new EdgeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Fish_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Fish_Utiliti.implicitlyWait));
	driver.manage().window().maximize();
			
		
		
	}
	}
	public static void LaunchURL(String URL) {
		driver.get(FiPro.getProperty("FiURL"));
		
		
	}
	
	
}
