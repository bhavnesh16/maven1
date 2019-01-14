package test.api.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_001_GETMETHODS 
{
@Test
public void tc__01()
{
Response response=RestAssured.get("http://services.groupkt.com/country/get/iso2code/IN");
System.out.println(response.asString());
System.out.println(response.getStatusCode());
Assert.assertEquals(response.getContentType(),"application/json;charset=UTF-8");
}
}
