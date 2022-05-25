package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends Baseclass{
	
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement txtPass;
	@FindBy(id="login")
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getLogin() {
		return login;
	}

}
