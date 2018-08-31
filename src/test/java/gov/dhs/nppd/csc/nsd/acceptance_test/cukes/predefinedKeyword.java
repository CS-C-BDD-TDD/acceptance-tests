package gov.dhs.nppd.csc.nsd.acceptance_test.cukes;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class predefinedKeyword {

	@Given("^a STIX file contains a free text field of \"([^\"]*)\"$")
	public void a_STIX_file_contains_a_free_text_field_of(String arg1) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the system confirms the field$")
	public void the_system_confirms_the_field() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the field is tagged as potential PII for human review$")
	public void the_field_is_tagged_as_potential_PII_for_human_review() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the file is sent to human review queue$")
	public void the_file_is_sent_to_human_review_queue() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
