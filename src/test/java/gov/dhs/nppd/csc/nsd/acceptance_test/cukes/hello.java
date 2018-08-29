package gov.dhs.nppd.csc.nsd.acceptance_test.cukes;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.csc.nsd.acceptance_test.serenity.GreetingSteps;
import net.thucydides.core.annotations.Steps;


public class hello {

		@Steps
	private GreetingSteps greetingSteps;

	@Given("^I am  an English greeter$")
	public void i_am_an_English_greeter() throws Exception {
		greetingSteps.visit_website("http://google.com");
	}

	@When("^I say \"([^\"]*)\"$")
	public void i_say(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should receive \"([^\"]*)\"$")
	public void i_should_receive(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
