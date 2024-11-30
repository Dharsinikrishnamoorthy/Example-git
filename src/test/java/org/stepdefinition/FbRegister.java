package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.bas.Base;
import org.pojo.CreatenewFb;
import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbRegister extends Base{
	
	CreatenewFb c ;
	@Given("To launch the browser and mazmize window")
	public void to_launch_the_browser_and_mazmize_window() {
	  launchBrowser();
	  windowMaximize();
	}

	@When("To launch the url application")
	public void to_launch_the_url_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		c = new CreatenewFb();
		clickBtn(c.getCreateNewAcc());
	    
	}

	@When("To pass first name in first name text box")
	public void to_pass_first_name_in_first_name_text_box(DataTable d) {
		List<String> l = d.asList();
		c = new CreatenewFb();
		passText(l.get(2), c.getFrstName());
	}

	@When("To pass second name in surname text box")
	public void to_pass_second_name_in_surname_text_box(DataTable d) {
		Map<String, String> m = d.asMap(String.class, String.class);
		c = new CreatenewFb();
		passText(m.get("firstname3"), c.getLastName());
	}

	@When("To pass phoneno or email in email text box")
	public void to_pass_phoneno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		c = new CreatenewFb();
		passText(l.get(1).get(0), c.getMobileoremail());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		c = new CreatenewFb();
		passText(m.get(1).get("password1"), c.getPassword());
	}

	@Then("To close the chrome processor")
	public void to_close_the_chrome_processor() {
	    //closeEntireBrowser();
	}

}
