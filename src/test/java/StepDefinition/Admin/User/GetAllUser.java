package StepDefinition.Admin.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllUser {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All User")
    public String SetGETEndpointsAllUser(){
        return url + "users";
    }
    @Step("I send GET HTTP request All User")
    public void SendGETHTTPRequestAllUsers(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjkxMTgwOCwiaWF0IjoxNzAyODI1NDA4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.8a2c3-Q4fiRHXsWfr9nf9lAAxIFGH7xJ5Gsiqvf0O8s")
                .when()
                .get(SetGETEndpointsAllUser());
    }
    @Step("I send invalid GET HTTP request All User forbidden")
    public void SendInvalidGETHTTPRequestAllUserForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsAllUser());
    }
    @Step("I set invalid GET endpoints All User")
    public String SetInvalidGETEndpointsAllUser(){
        return url + "ripiu";
    }
    @Step("I send invalid GET HTTP request All User")
    public void SendInvalidGETHTTPRequestAllUser(){
        SerenityRest.given().post(SetInvalidGETEndpointsAllUser());
    }
}
