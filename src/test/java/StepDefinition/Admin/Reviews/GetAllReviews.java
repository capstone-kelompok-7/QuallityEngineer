package StepDefinition.Admin.Reviews;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllReviews {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All Reviews")
    public String SetGETEndpointsAllReviews(){
        return url + "products/reviews";
    }
    @Step("I send GET HTTP request All Reviews")
    public void SendGETHTTPRequestAllReviews(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjkxMTgwOCwiaWF0IjoxNzAyODI1NDA4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.8a2c3-Q4fiRHXsWfr9nf9lAAxIFGH7xJ5Gsiqvf0O8s")
                .when()
                .get(SetGETEndpointsAllReviews());
    }
    @Step("I send invalid GET HTTP request All Reviews forbidden")
    public void SendInvalidGETHTTPRequestAllReviewsForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsAllReviews());
    }
    @Step("I set invalid GET endpoints All Reviews")
    public String SetInvalidGETEndpointsAllReviews(){
        return url + "ripiu";
    }
    @Step("I send invalid GET HTTP request All Reviews")
    public void SendInvalidGETHTTPRequestAllReviews(){
        SerenityRest.given().post(SetInvalidGETEndpointsAllReviews());
    }


}
