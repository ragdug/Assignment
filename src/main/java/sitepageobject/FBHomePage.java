package sitepageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.BaseClass;

public class FBHomePage extends BaseClass {

  public FBHomePage(){
		PageFactory.initElements(driver, this);
  }
	
  @FindBy(xpath="//a[contains(@href,'profile')]")
  private WebElement profileLink;
	
  public void profileLinkClick(){
		
	profileLink.click();
	
  }
}
