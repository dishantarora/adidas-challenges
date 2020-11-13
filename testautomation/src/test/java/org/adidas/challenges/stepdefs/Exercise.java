package org.adidas.challenges.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Exercise {
	@Given("I set get API endpoint")
	public void i_set_get_api_endpoint() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI = "";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/");
		JsonPath jsonPathEvaluator = response.jsonPath();
		int statusCode = response.getStatusCode();
		String id = jsonPathEvaluator.get("id");
		String name = jsonPathEvaluator.get("name");
		String status = jsonPathEvaluator.get("status");
		String responseBody = response.getBody().asString();
	    throw new io.cucumber.java.PendingException();
	}

	@When("I sends the GET HTTP request")
	public void i_sends_the_get_http_request() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I receive valid HTTP resposne code {int}")
	public void i_receive_valid_http_resposne_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("response body")
	public void response_body() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
