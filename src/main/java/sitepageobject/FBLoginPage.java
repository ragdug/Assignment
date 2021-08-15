package sitepageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinition.BaseClass;



public class FBLoginPage extends BaseClass
{

    public FBLoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//img[contains(@alt,'Facebook')]")
    private WebElement FacebookLabelText;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement fbLoginButton;
	
	@FindBy(xpath="//a[contains(@aria-label,'Home')]")
	private WebElement homeButton;
	
	public void FbLoginPage(){
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(FacebookLabelText));
	}

   public void fbLogin(String uname,String pass ){
	   username.sendKeys(uname);
	   password.sendKeys(pass);
	   fbLoginButton.click();
   }
   
   public void HomeButtonValidation(){
	   WebDriverWait wait=new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOf(homeButton));
	}
	
	
	
}
