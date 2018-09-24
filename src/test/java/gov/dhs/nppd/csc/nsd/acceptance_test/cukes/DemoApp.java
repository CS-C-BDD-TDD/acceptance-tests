package gov.dhs.nppd.csc.nsd.acceptance_test.cukes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.csc.nsd.acceptance_test.serenity.DemoAppSteps;
import net.thucydides.core.annotations.Steps;

public class DemoApp {
	private static Logger logger = LoggerFactory.getLogger(DemoApp.class);

	@Steps
	private DemoAppSteps demoAppSteps;
	private String actualLatestVersion;

	@Given("^I am at the application \"([^\"]*)\"$")
	public void i_am_at_the_application(String url) throws Exception {
		logger.info("*** going to site @: " + url);
		demoAppSteps.visitSite(url);
	}

	@When("^I check the latest version$")
	public void i_check_the_latest_version() throws Exception {
		logger.info("*** checking version ...");
		actualLatestVersion = demoAppSteps.getLatestVersion();
	}

	@Then("^the version should be \"([^\"]*)\"$")
	public void the_version_should_be(String expectedLatestVersion) throws Exception {
		logger.info("*** expected: " + expectedLatestVersion + " - actual" + actualLatestVersion);
		assertThat(actualLatestVersion, equalTo(expectedLatestVersion));
	}

}
