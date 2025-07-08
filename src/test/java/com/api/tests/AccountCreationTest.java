package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "verify if account is getting created or not")

	public void createAccountTest() {
	SignUpRequest signUprequest=new SignUpRequest.Builder().userName("ashima2212").Email("ashimajj@gmail.com").firstName("aaashima")
				.password("Dreams2212").mobileNumber("8377990748").lastName("sharma").build();
		
	
	AuthService authService= new AuthService();
	Response response=authService.signUp(signUprequest);
	System.out.println(response.asPrettyString());
	}
}
