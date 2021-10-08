package Rest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class RS002_GET {
	
	
	@Test
	public  void test_01() {
		
		given().
		   get("https://reqres.in/api/users?page=2").
		then().
		  statusCode(200).
		  log().all();
		
	}

}
