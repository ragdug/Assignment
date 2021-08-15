package sitepageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import java.util.List;

import stepDefinition.BaseClass;
import utility.CommonMethod;

public class WalletHubInsuranceLandingPage extends BaseClass {
	
	CommonMethod common=new CommonMethod();
	Actions actions = new Actions(driver);
	
	public WalletHubInsuranceLandingPage(){
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//span[contains(@class,'signup-login')]")
    private WebElement signupLogin;
  

  
    @FindBy(xpath="//h1[contains(text(),'Test Insurance Company')]")
    private WebElement header;

  
    @FindBy(xpath="//h3[contains(@class,'rsba')]/following::*[contains(@style,'touch')][4]")
    private WebElement fourthstar;

    @FindBy(xpath="//div[contains(@class,'dropdown second')]")
    private WebElement dropdown;

    @FindBy(xpath="//div[contains(@class,'dropdown second opened')]/ul/li")
    private WebElement dropdownAllTheValue;

    @FindBy(xpath="//textarea[contains(@placeholder,'Write your review')]")
    private WebElement reviewTextArea;

    @FindBy(xpath="//div[contains(text(),'Submit')]")
    private WebElement submitButton;

    @FindBy(xpath="//h4[contains(text(),'Your review has been posted')]")
    private WebElement postedConfirmationMessage;

    @FindBy(xpath="//div[contains(text(),'Continue')]")
	private WebElement continueButton;

    @FindBy(xpath="//button[text()='edit']")
    private WebElement editButton;



    public void openWalletHubUrl(){
	  
	  driver.get("http://wallethub.com/profile/test_insurance_company/");
    }

  
   public void signupLoginClick(){
	   
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(header));
	signupLogin.click();
	
   }

   public void OnhoverStarLitUpValidation() throws InterruptedException{
	   

	   Thread.sleep(8000);
	   
	   List<WebElement> stars=driver.findElements(By.xpath("//h3[contains(@class,'rsba')]/following::review-star[1]//*[contains(@style,'touch')]"));
	   
	   for(int i=1;i<=stars.size();i++){
		   
		   WebElement starlit1=driver.findElement(By.xpath("//h3[contains(@class,'rsba')]/following::review-star[1]//*[contains(@style,'touch')]["+i+"]"));
		   actions.moveToElement(starlit1).perform();
		   WebElement starlit=driver.findElement(By.xpath("(//h3[contains(@class,'rsba')]/following::review-star[1]//*[contains(@style,'touch')]//*[@stroke='#4ae0e1'])["+i+"]"));	   
		   Thread.sleep(2000); 
		   System.out.println(starlit.getCssValue("stroke")); 
		   assertEquals(starlit.getCssValue("stroke"), "rgb(74, 224, 225)");
	
	   }
	   
	   
   }
   public void DropdownSelect(String dropdownValue){
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		common.dropdownSelect(dropdown, dropdownAllTheValue, dropdownValue);
   }
   
   public void reviewtextAreaInput(){
	
	   reviewTextArea.sendKeys("Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing ");
	   
   }
   
   public void submitButtonClick() throws InterruptedException{
	   

	   
	  actions.moveToElement(submitButton).perform();
	  actions.click().perform();
	  try{                               //Doing this step as Submit doesn't work properly in the first click
		  
		  for(int i=0;i<5;i++){
		  
		      continueButton.isDisplayed();
		      break;
		  }
	 
	  }
	 catch(Exception e){
		    WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(dropdown));
			common.dropdownSelect(dropdown, dropdownAllTheValue, "Health Insurance");
			reviewTextArea.sendKeys("Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing Testing ");
			actions.moveToElement(submitButton).perform();
			actions.click().perform();
			 
	  }
	 
   }
   
   public void confirmReviewMessagePosted(){
	   WebDriverWait wait=new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOf(postedConfirmationMessage));
   }
   
   public void continueButtonClick(){

	   actions.moveToElement(continueButton).click().perform();
	
   }
   
   public void fourthStarClick(){
	   fourthstar.click();
   }
   
   public void reviewCommentPostedVerification(){
	   WebDriverWait wait=new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOf(editButton));
   }
}
