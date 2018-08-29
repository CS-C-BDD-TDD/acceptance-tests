package gov.dhs.nppd.csc.nsd.acceptance_test.serenity;

import gov.dhs.nppd.csc.nsd.acceptance_test.pages.GreetingPage;
import net.thucydides.core.annotations.Step;

public class GreetingSteps {

	private GreetingPage greetingPage;

	@Step
	public void visit_website(String website) {
		greetingPage.visit(website);
		
	}

	

}
