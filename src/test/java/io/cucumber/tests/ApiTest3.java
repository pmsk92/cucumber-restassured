package io.cucumber.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class ApiTest3 extends BaseTest{

    @Given("^I want to enter the request for user$")
    public void initialiseUri(){
        RestAssured.baseURI = baseURL;
        System.out.println("Test is Starting.");
    }

    @When("^I submit my request of user2")
    public void submitRequest(){
        RequestSpecification request = RestAssured.given();
        response = request.get(baseURL+basePath+"users/2");
    }

    @When("^I should get successful response")
    public void getResponse(){
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200,"The user is not valid as wrong end point");
        System.out.println("Test Ends here.");
    }
}
