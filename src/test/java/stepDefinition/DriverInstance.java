package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInstance {

	private static DriverInstance instanceDriver=new DriverInstance();
	private WebDriver driver;
	
	private DriverInstance(){
		
	}
	
	public WebDriver initDriver(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");			
		System.setProperty("webdriver.chrome.driver", "exe\\chromedriver.exe");
		driver=new ChromeDriver(options);
		return driver;
	}
	
	public static DriverInstance getInstance(){

		return instanceDriver;
					
		
	}
	
}
