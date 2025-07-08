package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test(description = "verify if password is getting set or not")
	public void forgotPasswordTest()
	{
		
		AuthService authService = new AuthService();
	Response response=	authService.forgotPassword("ashimajjain@gmail.com");
		System.out.println(response.asPrettyString());
	}
}
