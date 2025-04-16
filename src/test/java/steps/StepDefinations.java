package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.TestBuildData;
import resources.Utils;

import static io.restassured.RestAssured.given;

public class StepDefinations extends Utils {
    TestBuildData data = new TestBuildData();
    @Given("update login auth payload with {string} and {string}")
    public void update_login_auth_payload_with_and(String userName, String userPwd) {
        // Write code here that turns the phrase above into concrete actions
            given().spec(requestSpecification()).body(data.logPayload(userName,userPwd));
    }
    @When("user calls {string} with {string} http request")
    public void user_calls_with_http_request(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("API call got success with status code {int}")
    public void api_call_got_success_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }
}
