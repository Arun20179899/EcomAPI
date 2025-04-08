Feature: Create a Order
  Scenario: create a login auth token
    Given update login auth payload with "<userEmail>" and "<userPassword>"
    When user calls "LoginAuthToken" with "POST" http request
    Then API call got success with status code 200
    And "message" in response body is "Login Successfully"
