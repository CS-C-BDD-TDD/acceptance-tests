package gov.dhs.nppd.csc.nsd.acceptance_test.util;

import gov.dhs.nppd.humanreview.client.api.HumanReviewApi;

public class TestUtil {

	private static HumanReviewApi api = new HumanReviewApi(getHrRestApiUrl());

	public static Boolean hrRestApiIsOperational() {
		return api.getCurrentState();
	}

	public static String getHrRestApiUrl() {
		return System.getProperty("hr.restapi.url");
	}

}
