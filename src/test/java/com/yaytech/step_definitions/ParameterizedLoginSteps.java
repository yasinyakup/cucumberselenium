package com.yaytech.step_definitions;

import com.yaytech.pages.DashboardPage;
import com.yaytech.pages.LoginPage;
import com.yaytech.util.BrowserUtils;
import com.yaytech.util.TestBase;
import com.yaytech.util.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;


public class ParameterizedLoginSteps {

    @Given("p-the user is on the login pager")
    public void p_the_user_is_on_the_login_pager() {
       Assert.assertEquals("https://qa3.vytrack.com/user/login", WebDriverFactory.getDriver().getCurrentUrl());
    }


    @When("p-the user enter {string} and {string} information")
    public void p_the_user_enter_and_information(String userName, String password) {
        BrowserUtils.waitFor(3);
        System.out.println(userName + " _-_ " + password);
        LoginPage loginPage = new LoginPage();
        loginPage.loginDirectWithoutConfigurationFile(userName, password);
    }
    @Then("p-the user should be login and display {string}")
    public void p_the_user_should_be_login_and_display(String subTitle) {
        System.out.println(new DashboardPage().pageSubTitle.getText());
        BrowserUtils.waitFor(4);
        Assert.assertEquals(subTitle, new DashboardPage().pageSubTitle.getText());

    }
}
