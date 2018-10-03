package gov.dhs.nppd.csc.nsd.acceptance_test.serenity;

import gov.dhs.nppd.csc.nsd.acceptance_test.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class AnalystSteps {

	private LoginPage loginPage;

	@Step
	public void visits_web_site(String hrWebsiteUrl) {
		loginPage.visit(hrWebsiteUrl);
	}

	@Step
	public void logins(String username, String password) {
		loginPage.logins(username, password);
	}

	public String gets_title_of_human_review_pending_page() {
		return loginPage.getsMainPageTitle();
	}

}
