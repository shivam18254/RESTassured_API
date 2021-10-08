
//POST request Created
package Rest;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RS001_POST {
	
	
	@Test
	public void test_post() {
		 
		  JSONObject request = new JSONObject();
		
		
		request.put("name","shivam");
	    request.put("job","student");
	    
	    
	    System.out.println(request);
	    System.out.println(request.toJSONString());
	    
	   
	    given().
	    header("Content-Type","application/json").
	    contentType(ContentType.JSON).
	    body(request.toJSONString());
	    when().
	    post("https://reqres.in/api/users").
	    then().
	    statusCode(415);
		
	}
	

		
		
	}


