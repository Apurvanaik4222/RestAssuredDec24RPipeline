package steps;

import Utils.ReusableCode;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import resources.APIResource;
import resources.TestDataBuild;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class StepsDefinations extends ReusableCode {
    RequestSpecification req;
    Response response;
      JsonPath js;
     static  String place_id;

    @Given("AddPLace API with payload {string} {string} {string}")
    public void add_p_lace_api_with_payload(String name, String language, String address) throws FileNotFoundException {
        req  = given().log().all().spec(requestSpecification()
                .body(TestDataBuild.addPlacePayload(name,address,language)));

    }


    @When("user calls {string} with http {string} request")
    public void user_calls_with_http_request(String resource, String method) {
        APIResource resourceName =APIResource.valueOf(resource);
        if(method.equalsIgnoreCase("GET"))
        response =  req.when().get(resourceName.getResource());
         else if (method.equalsIgnoreCase("POST"))
            response =  req.when().post(resourceName.getResource());
         else if (method.equalsIgnoreCase("DELETE"))
            response =  req.when().delete(resourceName.getResource());
         else if (method.equalsIgnoreCase("PUT"))
            response =  req.when().put(resourceName.getResource());



    }
    @Then("user should get response with status code as {int}")
    public void user_should_get_response_with_status_code_as(int statusCode) {
        response.then().log().all().spec(responseSpecification());
        Assert.assertEquals(response.getStatusCode(),statusCode);

    }
    @Then("{string} in response body should be {string}")
    public void in_response_body_should_be(String key, String value) {
         js = ReusableCode.rawToJson(response.asString());
        Assert.assertEquals(js.get(key),value);

    }

    @Then("verify place_id created maps to {string} using {string}")
    public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws FileNotFoundException {
       place_id =  js.get("place_id");
        req =given().spec(requestSpecification()).queryParam("place_id",place_id);
        user_calls_with_http_request(resource,"GET");
       js = ReusableCode.rawToJson(response.asString());
        Assert.assertEquals(expectedName,js.get("name").toString());

    }

    @Given("DeletePlace API with payload")
    public void delete_place_api_with_payload()  throws FileNotFoundException{
     req =given().log().all().spec(requestSpecification()).body(TestDataBuild.deletePlacePayload(place_id));
    }
}
