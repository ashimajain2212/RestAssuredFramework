package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	
	@Test(description = "get profile info")
	public void getProfileInfoTest()
	{
		
		AuthService authService= new AuthService();
	Response response=	authService.login(new LoginRequest("ashimajain", "Dreams#2212"));
	LoginResponse loginResponse	=response.as(LoginResponse.class);
	
String token= loginResponse.getToken();
System.out.println(token);
	UserProfileManagementService userProfileManagementService= new UserProfileManagementService();

response= userProfileManagementService.getProfile(token);
UserProfileResponse userProfileResponse =response.as(UserProfileResponse.class);
System.out.println(response.asPrettyString());
System.out.println(userProfileResponse.getUsername());
	}
	
	
	

}
