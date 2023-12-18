package StepDefinition.Customer.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PostRegister {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set POST endpoints Register")
    public String setPostEndpointRegister(){
        return url + "auth/register";
    }

    @Step("I send POST HTTP request Register")
    public void sendPostHttpRequestRegister(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "d027a1659f774a@crankymonkey.info");
        requestBody.put("Password", "regist123");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEndpointRegister());
    }
    @Step("I set POST invalid endpoints Register")
    public String setPostApiInvalidEndpointRegister(){
        return url + "login";
    }

    @Step("I send invalid POST HTTP request Register")
    public void sendInvalidPostHttpRequestRegister(){
        SerenityRest.given().post(setPostApiInvalidEndpointRegister());
    }
}
