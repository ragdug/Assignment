package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {

	
public static WebDriver driver=null;



@Before
    public static void setup(){
	
	DriverInstance instanceDriver=DriverInstance.getInstance();
	driver=instanceDriver.initDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	}



@After
    public static void dispose(){
	
	driver.close();
	
	}
}