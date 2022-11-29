package medicare;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MOSTPURCHASEDPRODUCTS {
	
	@Test
	public void test1() {
		
		RestAssured.baseURI = "http://localhost:8082/medicare/json/data/mp/products";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get();
		
		String ResposneBody = response.getBody().asString();
		
		System.out.println(ResposneBody);
		
	}
}