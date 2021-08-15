package sitepageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.BaseClass;

public class FBProfilePage extends BaseClass {
	
	
	public FBProfilePage(){
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//span[contains(text(),'mind')]")
    private WebElement statusInputBox;
    
    @FindBy(xpath="//span[contains(text(),'Create post')]")
    private WebElement createPostPopup;
    
    @FindBy(xpath="//div[contains(@aria-label,'mind')]")
    private WebElement postInputText;
    
    @FindBy(xpath="//div[contains(@aria-label,'Post')]")
    private WebElement postButton;
    
  

	
    public void statusClick(){
    	
    	statusInputBox.click();
    }
    
    public void createPostPopupOpenValidation(){
    	
    	WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(createPostPopup));
    }
    
    public void inputFBStatus(){
    	
    	postInputText.sendKeys("My Post using Selenium");
    }
    
    public void postButtonClick(){
    	
    	postButton.click();
    }

}
