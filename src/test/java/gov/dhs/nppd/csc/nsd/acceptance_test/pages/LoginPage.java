package gov.dhs.nppd.csc.nsd.acceptance_test.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameField;

	public void visit(String hrWebsiteUrl) {
		openAt(hrWebsiteUrl);
	}

	public void logins(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
	}

	public String getsMainPageTitle() {
		return this.getTitle();
	}

}
