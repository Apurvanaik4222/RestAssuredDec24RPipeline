package steps;

import io.cucumber.java.Before;

import java.io.IOException;


public class Hooks {


    @Before("@DeletePlace")
    public void beforeDeleteScenario() throws IOException {
        StepsDefinations steps = new StepsDefinations();
        if(StepsDefinations.place_id==null){
            steps.add_p_lace_api_with_payload("Shetty", "French", "Asia");
            steps.user_calls_with_http_request("AddPlaceAPI", "POST");
            steps.in_response_body_should_be("status", "OK");
            steps.verify_place_id_created_maps_to_using("Shetty", "GetPlaceAPI");
        }



        }


    }

