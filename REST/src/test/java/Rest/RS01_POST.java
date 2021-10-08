package Rest;

import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import io.restassured.RestAssured;


public class RS01_POST {
	
	
	public static HashMap map= new HashMap();
	
	@BeforeClass
	public void postdata() {
		
		map.put("name",RESTUtils.getFirstname());
		map.put("job",RESTUtils.getjob());
		map.put("id",RESTUtils.getid());
		
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
	}
	
	@Test
	
	public void testPost() {
		
	given()
	
	.contentType("application/json")
	.body(map)
	
	.when()
	.post()
	
	
	.then()
		.statusCode(200);
	}
	

}
