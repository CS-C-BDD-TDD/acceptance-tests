package gov.dhs.nppd.csc.nsd.acceptance_test.util;

public class TestUtil {

//	private static HumanReviewApi api = new HumanReviewApi(getHrRestApiUrl());
//
//	public static Boolean hrRestApiIsOperational() {
//		return api.getCurrentState();
//	}
//
//	public static String getHrRestApiUrl() {
//		return System.getProperty("hr.restapi.url");
//	}
//
	public static String getHrWebsiteUrl() {
		return System.getProperty("hr.website.url");
	}

	public static String getRegularUserName() {
		return System.getProperty("hr.regular.username");
	}

	public static String getRegularPassword() {
		return System.getProperty("hr.regular.password");
	}

}
