package Utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ReusableCode {
    static RequestSpecification baseReq;
    ResponseSpecification baseRsp;

    public static JsonPath rawToJson(String response){
        JsonPath js = new JsonPath(response);
        return js;
    }


    public RequestSpecification requestSpecification() throws FileNotFoundException {
        if(baseReq==null) {
            PrintStream stream =new PrintStream(new FileOutputStream("logging.txt"));
             baseReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com" )
                    .addQueryParam("key", "qaclick123" )
                     .addFilter(RequestLoggingFilter.logRequestTo(stream))
                     .addFilter(ResponseLoggingFilter.logResponseTo(stream))
                    .setContentType(ContentType.JSON).build();
            return baseReq;
        }
        return baseReq;
    }

    public ResponseSpecification responseSpecification() {
        if(baseRsp==null) {
             baseRsp =new ResponseSpecBuilder().expectStatusCode(200)
                    .expectContentType(ContentType.JSON).build();
            return baseRsp;
        }else
            return baseRsp;
    }
}
