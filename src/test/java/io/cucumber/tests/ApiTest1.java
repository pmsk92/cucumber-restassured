package io.cucumber.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;


public class ApiTest1 extends BaseTest{
    @Given("^I want to execute the GetUsers end point$")
    public void initialiseUri(){
        RestAssured.baseURI = baseURL;
        System.out.println("Test is Starting.");
    }

    @When("^I submit the request")
    public void submitRequest(){
        RequestSpecification request = RestAssured.given();
        response = request.get(baseURL+basePath+"users?page=2");
    }

    @When("^I should get 200 response")
    public void getResponse(){
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200,"The given end point is not valid");
        System.out.println("Test Ends here.");
    }
}
