package StepDefinition.Customer.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PostLoginCustomer {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set POST endpoints login customer")
    public String setPostEndpointLoginCustomer(){
        return url + "auth/login";
    }

    @Step("I send POST HTTP request login Customer")
    public void sendPostHttpRequestLoginCustomer(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "pijade5920@arensus.com");
        requestBody.put("Password", "admin1234");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEndpointLoginCustomer());
    }
    @Step("I set POST invalid endpoints login Customer")
    public String setPostApiInvalidEndpointLoginCustomer(){
        return url + "login";
    }

    @Step("I send invalid POST HTTP request login Customer")
    public void sendInvalidPostHttpRequestLoginCustomer(){
        SerenityRest.given().post(setPostApiInvalidEndpointLoginCustomer());
    }
}
