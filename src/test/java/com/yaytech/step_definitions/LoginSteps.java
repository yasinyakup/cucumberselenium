package com.yaytech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoginSteps {

    @When("the user is on the login page")
    public void the_user_is_on_the_login_page1323434() throws InterruptedException {
        Thread.sleep(5000);
       // CompletableFuture<Void> c = CompletableFuture.runAsync(test());
        ExecutorService s = Executors.newSingleThreadExecutor();
        s.submit(test());
        System.out.println("I open chrome browser and navigate to VyTrack login page");
    }
    public Runnable test(){
        return  ()->{
            System.out.println("this is a test for runnable");
        };


    }


    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("I enter User1 as user name and UserUser123 as password and click login button");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verify that title changed to the Dashboard");
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("I enter Salesmanager120 as user name and UserUser123 as password adn click login button");
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        System.out.println("I enter Storemanager120 as user name and UserUser123 as password adn click login button");
    }


}
