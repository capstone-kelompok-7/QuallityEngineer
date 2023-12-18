package StepDefinition.Customer.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PostResendOTP {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set POST endpoints Resend OTP")
    public String setPostEndpointResendOTP(){
        return url + "auth/resend-otp";
    }

    @Step("I send POST HTTP request Resend OTP")
    public void sendPostHttpRequestResendOTP(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "d027a1657f724c@crankymonkey.info");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEndpointResendOTP());
    }
    @Step("I set POST invalid endpoints Resend OTP")
    public String setPostApiInvalidEndpointResendOTP(){
        return url + "auth/resnd-otp";
    }

    @Step("I send invalid POST HTTP request Resend OTP")
    public void sendInvalidPostHttpRequestResendOTP(){
        SerenityRest.given().post(setPostApiInvalidEndpointResendOTP());
    }
}
