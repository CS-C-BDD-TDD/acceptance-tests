package gov.dhs.nppd.csc.nsd.acceptance_test.serenity;

import gov.dhs.nppd.csc.nsd.acceptance_test.pages.DemoAppPage;
import net.thucydides.core.annotations.Step;

public class DemoAppSteps {

	private DemoAppPage demoAppPage;

	@Step
	public void visitSite(String url) {
		demoAppPage.openAt(url);
	}

	@Step
	public String getLatestVersion() {
		return demoAppPage.getLatestVresion();
	}

}
