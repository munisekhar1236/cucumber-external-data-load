package com.sample.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FruitsStepDef {

	@Given("I have list of fruits with colors.")
	public void scenario_fruits() {
		System.out.println("I have list of fruits with it's color");
	}
	
	@When("I selct fruit {string}.")
	public void scenario_fruit(String name) {
		System.out.println("Fruit name is :: "+name);
	}
	
	@Then("Color should be {string}.")
	public void scenario_fruit_color(String color) {
		System.out.println("color is :: "+color);
	}
	
}
