package sitepageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.BaseClass;

public class WalletHubInsuranceLoginPage extends BaseClass {

  public WalletHubInsuranceLoginPage(){
		
		PageFactory.initElements(driver, this);
  }
	
  @FindBy(id="email")
  private WebElement emailLogin;
  
  @FindBy(id="password")
  private WebElement passwordLogin;
  
  @FindBy(xpath="//span[contains(text(),'Login')]/..")
  private WebElement loginButton;
  
  public void walletHubInsuranceLogin(String uname,String pass ){
	  
	  WebDriverWait wait=new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOf(emailLogin));
	  emailLogin.sendKeys(uname);
	  passwordLogin.sendKeys(pass);
	  loginButton.click();
  
  }
	
	
	
}
