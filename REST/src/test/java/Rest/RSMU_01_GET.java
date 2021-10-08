package Rest;

import java.util.HashMap;

import org.junit.BeforeClass;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class RSMU_01_GET {
	

	public static HashMap map=new HashMap();
	
	String Firstname= RESTUtils.getFirstname();
	String Lastname= RESTUtils.getLastname();
	String Email=RESTUtils.getEmail();
	int id=2;
	
	
	@BeforeClass
	public void putdata() {
		
		map.put("name",Firstname);
		map.put("Lastname",Lastname);
		map.put("Email",Email);
	
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RestAssured.basePath="/update/"+id;
		
		
	}
	public void testPut()
	{
		given()
		.contentType("Application/json")
		 .body(map)
		 .when()
		 .put().then()
		 .statusCode(200);
		
	}

}
