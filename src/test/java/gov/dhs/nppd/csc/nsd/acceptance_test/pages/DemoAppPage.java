package gov.dhs.nppd.csc.nsd.acceptance_test.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class DemoAppPage extends PageObject {

	@FindBy(xpath = "//p[contains(text(), 'Updated')]")
	WebElement updatedMessage;

	public String getLatestVresion() {
		return updatedMessage.getText().split(" ")[4];
	}

}
