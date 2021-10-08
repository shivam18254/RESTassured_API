package Rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class RS01_GET {
	
	
	@Test
	public void getDetails() {
		
		
		given()
		.when()
		.get("https://reqres.in/#support-heading")
		.then()
	     
		.statusCode(200);
	}
	

}
