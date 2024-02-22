package Resourses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import io.restassured.response.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class Utils1 {

   public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException {
		// RestAssured.baseURI="https://rahulshettyacademy.com";
		if(req==null) {
			
			PrintStream stream = new PrintStream(new FileOutputStream("Log.text"));  //CREATING LOG FILE...
			req = new RequestSpecBuilder().setBaseUri(getCommonValuesFromFile("baseURL"))
					.addQueryParam("key","qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(stream))
					.addFilter(ResponseLoggingFilter.logResponseTo(stream))
					.setContentType(ContentType.JSON).build();
			return req;
		}
		return req;
	}
	public static String getCommonValuesFromFile(String key) throws IOException {
		Properties pro = new Properties();
		FileInputStream path = new FileInputStream("F:\\Java_Automation\\Bdd\\src\\test\\java\\Resourses\\Common.properties");
		pro.load(path);
		return pro.getProperty(key);
	}
	//Making common JsonPath method for all get,post & delete
	public String getJsonPath(Response respp,String key) {
		String responsss = respp.asString();
		JsonPath js = new JsonPath(responsss);
		return js.get(key).toString();
    }
}
