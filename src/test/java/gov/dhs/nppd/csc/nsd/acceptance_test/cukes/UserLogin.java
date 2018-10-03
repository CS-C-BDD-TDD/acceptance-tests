package gov.dhs.nppd.csc.nsd.acceptance_test.cukes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.csc.nsd.acceptance_test.serenity.AnalystSteps;
import gov.dhs.nppd.csc.nsd.acceptance_test.util.TestUtil;
import net.thucydides.core.annotations.Steps;

public class UserLogin {

	@Steps
	private AnalystSteps analystSteps;

	private String username;
	private String password;

	@Given("^I am a regular user of the Human Review application$")
	public void i_am_a_regular_user_of_the_Human_Review_application() throws Exception {
		username = TestUtil.getRegularUserName();
		password = TestUtil.getRegularPassword();
		analystSteps.visits_web_site(TestUtil.getHrWebsiteUrl());
	}

	@When("^I login to the application website$")
	public void i_login_to_the_application_website() throws Exception {
		analystSteps.enters_username(username);
		analystSteps.enters_password(password);
		analystSteps.clicks_signin_button();
	}

	@Then("^I should be able to begin my work on human review activity$")
	public void i_should_be_able_to_begin_my_work_on_human_review_activity() throws Exception {
		String actualTitle = analystSteps.gets_title_of_human_review_pending_page();
		assertThat(actualTitle, equalTo("test-vue-app"));
	}

}
