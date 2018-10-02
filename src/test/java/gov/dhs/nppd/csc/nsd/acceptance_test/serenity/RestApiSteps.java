package gov.dhs.nppd.csc.nsd.acceptance_test.serenity;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ListOfHumanReviewItems;

import gov.dhs.nppd.csc.nsd.acceptance_test.util.TestUtil;
import gov.dhs.nppd.humanreview.client.api.HumanReviewApi;
import net.thucydides.core.annotations.Step;

public class RestApiSteps {

	@Step
	public boolean check_if_human_review_rest_api_is_operational() {
		return TestUtil.hrRestApiIsOperational();
	}

	@Step
	public ListOfHumanReviewItems gets_list_of_pending_human_review_fields() throws ApiException {
		HumanReviewApi api = new HumanReviewApi(TestUtil.getHrRestApiUrl());
		return api.getHumanReviewPending();
	}

}
