package com.prac.restassured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
//import static org.hamcrest.Matchers.*;

public class restprac2 {
	
	@Test
	public void test_response() {
		
	String url="http://demo.guru99.com/V4/sinkministatement.php";
		
	//log body	
/*	given().
	when().
	get(url+"?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").
	then().
	log().all();
	*/
	
/*	//pass query params
	given().queryParam("CUSTOMER_ID", "68195").
	queryParam("PASSWORD","1234").
	queryParam("Account_No","1").
	when().get(url).then().log().body();
*/
		
	//get status code
/*	int statusCode = given().queryParam("CUSTOMER_ID", "68195").
			queryParam("PASSWORD","1234").
			queryParam("Account_No","1").
			when().get(url).getStatusCode();
	
	System.out.println(" There response status is :"+statusCode);
	
	given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);
*/
	
	//Get Header details
/*	  System.out.println("The headers in the response "+
              get(url).then().extract()
      .headers());
      
      */
	
	
	//To get the time needed to fetch the response from the backend or other downstream systems, 
//	Rest Assured provides a method called ‘timeIn’ with a suitable timeUnit to get the
	//time taken to return the response.
/*	
	 System.out.println("The time taken to fetch the response "+get(url)
     .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
     
     */
	
	//You can get the content-Type of the response returned using the method is “contentType ()”.
/*	 System.out.println("The content type of response "+
	           get(url).then().extract()
	              .contentType());
*/
	
	//fetch data via path

	//String url2="https://reqres.in/api/users?page=2";
	
	String url2 = "https://jsonplaceholder.typicode.com/posts";
	
	ArrayList<String> data = given().
				when().
				get(url2).
				then().
				extract().
				path("userId");
		
		System.out.println("Fetched data is : "+data);
	              
	              
	              
	              
	              
	              
	              
	             
	              
	}

	
}
