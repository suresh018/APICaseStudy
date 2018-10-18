package gitHub;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.google.gson.Gson;

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
		//Assert.assertEquals(statusCode, 200, "Success.");
		if(statusCode==200){
			System.out.println("PASS");
			ResponseBody body=response.getBody();
			System.out.println(response.getBody().asString());
					
		}
		else{

			Assert.assertEquals(statusCode, 200, "GetUserDetails API Fails with error.");
			
		}
	}
	
}

