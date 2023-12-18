package StepDefinition.Admin.Reviews;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetReviewsById {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Reviews By Id")
    public String SetGETEndpointsReviewsById(){
        return url + "reviews/1";
    }
    @Step("I send GET HTTP request Reviews By Id")
    public void SendGETHTTPRequestReviewsById(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsReviewsById());
    }
    @Step("I send invalid GET HTTP request Reviews By Id forbidden")
    public void SendInvalidGETHTTPRequestReviewsByIdForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsReviewsById());
    }
    @Step("I set invalid GET endpoints Reviews By Id")
    public String SetInvalidGETEndpointsReviewsById(){
        return url + "ripiu";
    }
    @Step("I send invalid GET HTTP request Reviews By Id")
    public void SendInvalidGETHTTPRequestReviewsById(){
        SerenityRest.given().post(SetInvalidGETEndpointsReviewsById());
    }
}
