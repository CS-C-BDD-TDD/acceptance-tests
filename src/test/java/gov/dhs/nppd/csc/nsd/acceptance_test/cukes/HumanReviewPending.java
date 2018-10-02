package gov.dhs.nppd.csc.nsd.acceptance_test.cukes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import org.openapitools.client.model.ListOfHumanReviewItems;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.csc.nsd.acceptance_test.serenity.RestApiSteps;
import net.thucydides.core.annotations.Steps;

public class HumanReviewPending {
	
	@Steps
	private RestApiSteps restApiSteps;

	private ListOfHumanReviewItems listOfHumanReviewItems;

	@Given("^I Human Review service is operational$")
	public void i_Human_Review_service_is_operational() throws Exception {
		boolean hrRestApiIsOperational = restApiSteps.check_if_human_review_rest_api_is_operational();
		if (!hrRestApiIsOperational) {
			throw new Exception("Human Review Rest API is not operational.");
		}
	}

	@When("^I retrieve a list of pending human review fields$")
	public void i_retrieve_a_list_of_pending_human_review_fields() throws Exception {
		listOfHumanReviewItems = restApiSteps.gets_list_of_pending_human_review_fields();
	}

	@Then("^I should see a list of one or more fields ready for review$")
	public void i_should_see_a_list_of_one_or_more_fields_ready_for_review() throws Exception {
		assertThat(listOfHumanReviewItems.size(), greaterThanOrEqualTo(0));
	}

}
