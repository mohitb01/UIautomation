package com.gl.automation.stepdefinations;

import com.gl.automation.base.DriverScript;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends DriverScript {

    @Given("^I \"([^\"]*)\" IE$")
    public void i_IE(String action) throws Exception {
        sActionKeyword = action;
        execute_Actions();
        Thread.sleep(2000);
    }

    @When("^I \"([^\"]*)\" to URL$")
    public void i_to_URL(String action) throws Exception {
        sActionKeyword = action;
        execute_Actions();
        Thread.sleep(2000);
    }

    @And("^I \"([^\"]*)\" field$")
    public void i_field(String action) throws Exception {
        sActionKeyword = action;
        sPageObject = "txtbx_UserName";
        execute_Actions();
    }

    /*
     * @And("^I \"([^\"]*)\"$") public void i(String action) throws Exception {
     * sActionKeyword = action; sPageObject = OR.getProperty("txtbx_Password");
     * execute_Actions(); }
     * 
     * @And("^I \"([^\"]*)\" login button$") public void i_login_button(String
     * action) throws Exception { sActionKeyword = action; sPageObject =
     * OR.getProperty("btn_LogIn"); execute_Actions();
     * 
     * }
     */

    @Then("^User successfully login to application with message \"([^\"]*)\"$")
    public void
           user_successfully_login_to_application_with_message(String arg1) {

    }
}
