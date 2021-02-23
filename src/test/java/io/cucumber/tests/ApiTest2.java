package io.cucumber.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class ApiTest2 extends BaseTest{

    @Given("I want to enter the credentials")
    public void initialiseUri(){
        RestAssured.baseURI = baseURL;
        System.out.println("Test is Starting.");
    }
    @When("^I submit my details$")
    public void submitRequest(){
        RestAssured.baseURI = baseURL;
        RequestSpecification request = RestAssured.given();
        request.header("Authorization", "Bearer " +Token)
                .header("Content-Type", "application/json");
        response = request.body("{ \"email\":\"" + USERNAME + "\", \"password\":\"" + PASSWORD + "\"}")
                .post(baseURL+basePath+"login");
    }

    @Then("^I should get logged in successful$")
    public void getResponse(){
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200,"The Login is not successful");
        System.out.println("Test Ends here.");
    }
}
