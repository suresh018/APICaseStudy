package gitHub;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class HttpMethods {
	public Response GET(String url){
		RestAssured.baseURI=url;
		//Basic autthentication to provide username and password
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		//Provide your username and password for authentication
		authScheme.setUserName("xxx.yyy@gmail.com");
		authScheme.setPassword("pppppp");
		RestAssured.authentication = authScheme;
		// Get the RequestSpecification of the request that you want to sent to the server.
		RequestSpecification httpRequest=RestAssured.given();		  
		Response response=httpRequest.request(Method.GET);
		return response;
	}
	
}
