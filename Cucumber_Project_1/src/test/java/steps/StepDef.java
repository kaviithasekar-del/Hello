package steps;

import Pages.Set1;
import Pages.Set2;
import Pages.Set3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	Set1 s1 = new Set1();
    Set2 s2 = new Set2();
    Set3 s3 = new Set3();
	@Given("User enter the url")
	public void user_enter_the_url() {
	    
	}
	@When("user clicks the radio button")
	public void user_clicks_the_radio_button() {
	    s1.radioButton();
	}
	@When("user enter the country name {string}")
	public void user_enter_the_country_name(String string) {
	    s1.suggessionExample(string);
	}
	@When("user select option from dropdown")
	public void user_select_option_from_dropdown() {
	    s1.dropDown();
	}
	@When("user click the check box")
	public void user_click_the_check_box() {
	   s1.checkBoxEx();
	}
	@Then("first set successfully tested")
	public void first_set_successfully_tested() {
	    System.out.println("success");
	}
	
	//______________________________________________________________________//

	@When("user clicks the open window")
	public void user_clicks_the_open_window() {
	    s2.windowHandling();
	    
	}

	@When("user clicks the open tab")
	public void user_clicks_the_open_tab() {
	    s2.tabClick();
	    
	}

	@When("user enter the name and clicks the alert")
	public void user_enter_the_name_and_clicks_the_alert() {
	    s2.Alertbtn();
	}

	@When("user enter the name and clicks the confirm alert")
	public void user_enter_the_name_and_clicks_the_confirm_alert() {
		s2.confirmbtn();
	}

	@Then("second set successfully tested")
	public void second_set_successfully_tested() {
	    System.out.println("Success");
	}
//__________________________________________________________________________________________//
	@When("user enter the name")
	public void user_enter_the_name() {
	    s3.displayName();
	}

	@When("user clicks the hide and show button")
	public void user_clicks_the_hide_and_show_button() {
	   s3.hideShowBtn();
	}

	@When("user get text in the webTable")
	public void user_get_text_in_the_web_table() {
	    
	}

	@Then("third set successfully tested")
	public void third_set_successfully_tested() {
	    
	}




}
