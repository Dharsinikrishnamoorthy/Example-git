package org.pojo;

import org.bas.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewFb extends Base{
	public CreatenewFb() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(name = "firstname")
	private WebElement frstName;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileoremail;
	
	@FindBy(id = "password_step_input")
	private WebElement password;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileoremail() {
		return mobileoremail;
	}

	public WebElement getPassword() {
		return password;
	}

}
