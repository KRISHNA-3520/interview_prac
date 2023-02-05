package com.prac.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restprac1 {
	
	
@Test
public void GetBookDetails() {
	RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts"; 
	
	RequestSpecification httpRequest = RestAssured.given();
	
	Response resp = httpRequest.request(Method.GET,"");
	
	System.out.println("Response=>" + resp.prettyPrint());
	
}

}
