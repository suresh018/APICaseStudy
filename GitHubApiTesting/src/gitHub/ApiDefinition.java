package gitHub;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.google.gson.Gson;

import gitHub.DeSerializeClass.UserDetails;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class ApiDefinition {
	
	int statusCode;
	String url=null;
	JSONObject reqbody;
	Gson gson= new Gson();
	ApiEndpoint apiurl=new ApiEndpoint();
	HttpMethods httpMethods= new HttpMethods();
	
	public void GetUserDetails() throws AssertionError{
		 
		url=apiurl.getUserDetailsURI();
		Response response=httpMethods.GET(url);
		statusCode=response.getStatusCode();
		ResponseBody body=response.getBody();
		//Deserialize the json response body and store in a class
		UserDetails userDetails=gson.fromJson(body.asString(), UserDetails.class);
		//Assert.assertEquals(statusCode, 200, "Success.");
		if(statusCode==200){
			//We can extract different field value of the response using the deserialize class
			System.out.println(userDetails.login);
			
			//Print the whole response body
			System.out.println(body.asString());
			
					
		}
		else{
			

			Assert.assertEquals(statusCode, 200, "GetUserDetails API Fails with error."+body.asString());
			
		}
	}
	
}

