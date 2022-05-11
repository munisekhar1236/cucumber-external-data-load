package com.sample.stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
   
    @Given("scenario data")
    public void scenario_data() {
        System.out.println("Scenario Have Some Data");
    }

    @When("executed from Runner Class.")
    public void executed_from_Runner_Class() {
        System.out.println("Executed From Runner Class");
    }

    @Then("UserName and Password shows on console from Examples {string} and {string}.")
    public void username_and_Password_shows_on_console_from_Examples_and(String userName, String password) {
        System.out.println("UserName : " + userName + " Password : " + password);
    }

    @Then("UserName and Password shows on console from datatable.")
    public void username_and_Password_shows_on_console_from_datatable(DataTable dataTable) {
        System.out.println("Data Table UserName : " + dataTable.asLists().get(1).get(0) + " Password : " + dataTable.asLists().get(1).get(1));
        System.out.println("Data Table UserName : " + dataTable.asList().get(2) + " Password : " + dataTable.asList().get(3));
        System.out.println("Data Table UserName : " + dataTable.asMaps().get(0).get("UserName") + " Password : " + dataTable.asMaps().get(0).get("Password"));
        System.out.println("Data Table UserName : " + dataTable.asMaps(String.class, String.class).get(0).get("UserName") + " Password : " + dataTable.asMaps(String.class, String.class).get(0).get("Password"));
    }
}