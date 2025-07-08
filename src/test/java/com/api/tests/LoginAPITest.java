package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	@Test(description = "verify if login is working or not")
	public void loginTest()

	{

		LoginRequest loginReq = new LoginRequest("ashimajain", "Dreams#2212");	
		AuthService authService = new AuthService();

		Response response = authService.login(loginReq);



		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getEmail(), "ashimajain2212@gmail.com");
		/*
		 * 
		 * 
		 * Response response =
		 * given().baseUri("http://64.227.160.186:8080/").header("Content-Type",
		 * "application/json") .body().post("api/auth/login");
		 * 
		 * System.out.println(response.asPrettyString());
		 * 
		 * Assert.assertEquals(response.getStatusCode(), 200);
		 * 
		 * return response;
		 * 
		 */

	}

}
