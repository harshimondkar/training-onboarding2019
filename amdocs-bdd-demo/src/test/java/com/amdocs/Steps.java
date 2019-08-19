package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	private Hello hello;
	String actualResponse;
	
	@Given("I have created say hello")
	public void i_have_created_say_hello() {
	    hello = new Hello();
	}

	@When("I invoke sayHello method on hello object")
	public void i_invoke_sayHello_method_on_hello_object() {
	    actualResponse= hello.sayHello();
	}

	@Then("I expect the response {string}")
	public void i_expect_the_response(String expectedResponse) {
	    assertEquals(expectedResponse, actualResponse);
	}



}
