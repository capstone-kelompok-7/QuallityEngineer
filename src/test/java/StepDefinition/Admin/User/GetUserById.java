package StepDefinition.Admin.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetUserById {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints User By Id")
    public String SetGETEndpointsUserById(){
        return url + "users/24";
    }
    @Step("I send GET HTTP request User By Id")
    public void SendGETHTTPRequestUserById(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjkxMTgwOCwiaWF0IjoxNzAyODI1NDA4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.8a2c3-Q4fiRHXsWfr9nf9lAAxIFGH7xJ5Gsiqvf0O8s")
                .when()
                .get(SetGETEndpointsUserById());
    }
    @Step("I send invalid GET HTTP request User By Id forbidden")
    public void SendInvalidGETHTTPRequestUserByIdForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsUserById());
    }
    @Step("I set invalid GET endpoints User By Id")
    public String SetInvalidGETEndpointsUserById(){
        return url + "User";
    }
    @Step("I send invalid GET HTTP request User By Id")
    public void SendInvalidGETHTTPRequestUserById(){
        SerenityRest.given().post(SetInvalidGETEndpointsUserById());
    }
}
