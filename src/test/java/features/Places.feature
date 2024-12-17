Feature: Validating places API

 @AddPlace
 Scenario Outline: Validating ADDPLAce API is successfully able to add place
    Given AddPLace API with payload "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with http "POST" request
    Then user should get response with status code as 200
    And "status" in response body should be "OK"
    And "scope" in response body should be "APP"
    And verify place_id created maps to "<name>" using "GetPlaceAPI"

    Examples:
    |name      |language       |address    |
    |Apurva    | English       |  Pune     |
    #|Ajinkya   | French        |  Ireland  |


  @DeletePlace
  Scenario: Verify Delete API functionality is working properly
    Given DeletePlace API with payload
    When user calls "DeletePlaceAPI" with http "POST" request
    Then user should get response with status code as 200
    And "status" in response body should be "OK"
