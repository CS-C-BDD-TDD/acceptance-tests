package gov.dhs.nppd.csc.nsd.acceptance_test.pages;

import net.serenitybdd.core.pages.PageObject;

public class GreetingPage extends PageObject {

	public void visit(String website) {
		getDriver().manage().window().maximize();
		this.openAt(website);
		
		
		
	}
	
	

}
