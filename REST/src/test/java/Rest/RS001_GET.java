package Rest;



import org.asynchttpclient.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RS001_GET {
	
	@Test
	void test_01() {
		
	io.restassured.response.Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	
	System.out.println("response body is :"+response.asString());
	System.out.println("output od get body is :"+response.getBody().asString());
	System.out.println("StatusCode is :"+response.getStatusCode());
	System.out.println("Status line is :"+response.getStatusLine());
	System.out.println("type is :"+response.getHeader("content-type"));
	System.out.println("time is :"+response.getTime());
	
	
	
	
		
	}

	
}
