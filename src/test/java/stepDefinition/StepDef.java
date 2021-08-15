package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sitepageobject.FBHomePage;
import sitepageobject.FBLoginPage;
import sitepageobject.FBProfilePage;
import sitepageobject.WalletHubInsuranceLandingPage;
import sitepageobject.WalletHubInsuranceLoginPage;





public class StepDef{
	FBLoginPage fblgn= new FBLoginPage();
	FBHomePage fbhome= new FBHomePage();
	FBProfilePage fbProfile= new FBProfilePage();
	WalletHubInsuranceLoginPage walletHubInscmpTestLogin =new WalletHubInsuranceLoginPage();
	WalletHubInsuranceLandingPage walletHubInscmpTestLanding =new WalletHubInsuranceLandingPage();
	
	@Given("^user on Facebook Login Page$")
	public void user_on_Facebook_Login_Page() throws Throwable {
		
		fblgn.FbLoginPage();

	}

	@Then("^verify user is able to see the Home Button$")
	public void verify_user_is_able_to_see_the_Home_Button() throws Throwable {
		fblgn.HomeButtonValidation();
	
	}
	
	@When("^user logins in FB using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logins_in_self_heal_using_and(String uname, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fblgn.fbLogin(uname, pass);
	}

	@Then("^user clicks on Profile Button$")
	public void user_clicks_on_Profile_Button() throws Throwable {
		fbhome.profileLinkClick();
	    
	}

	@Then("^user clicks on Status Box$")
	public void user_clicks_on_Status_Box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fbProfile.statusClick();
	}

	@Then("^user Enters the status$")
	public void user_Enters_the_status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fbProfile.createPostPopupOpenValidation();
		fbProfile.inputFBStatus();
	}

	@Then("^user post the status$")
	public void user_post_the_status() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		fbProfile.postButtonClick();
	}
	
	
	@Given("^user on WalletHub Insurance company Test$")
	public void user_on_WalletHub_Insurance_company_Test() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.openWalletHubUrl();
	}
	
	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.signupLoginClick();
	}

	@When("^user logins in WalletHub using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logins_in_WalletHub_using_and(String email, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLogin.walletHubInsuranceLogin(email, pass);
	}

	@Then("^validate Stars are lighten up$")
	public void validate_Stars_are_lighten_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.OnhoverStarLitUpValidation();
	}
	
	@Then("^user clicks on fourth star$")
	public void user_clicks_on_fourth_star() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.fourthStarClick();
	}

	@Then("^user select \"([^\"]*)\" from the dropdown$")
	public void user_select_from_the_dropdown(String value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.DropdownSelect(value);
	}

	@Then("^user writes the review comment$")
	public void user_writes_the_review_comment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.reviewtextAreaInput();
	}

	@Then("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.submitButtonClick();
	}

	@Then("^user verify the review comment post is successfull$")
	public void user_verify_the_review_comment_post_is_successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.confirmReviewMessagePosted();
	}

	@Then("^user clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.continueButtonClick();
	}
	
	@Then("^verify user review got updated$")
	public void verify_user_review_got_updated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		walletHubInscmpTestLanding.reviewCommentPostedVerification();
	}	
	
}