package StepDefinition.Admin.Carousel;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetCarouselById {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Carousel by Id")
    public String SetGETEndpointsCarouselById(){
        return url + "carousel/52";
    }
    @Step("I send GET HTTP request Carousel by Id")
    public void SendGETHTTPRequestCarouselById(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsCarouselById());
    }
    @Step("I send invalid GET HTTP request Carousel by Id forbidden")
    public void SendInvalidGETHTTPRequestCarouselByIdForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsCarouselById());
    }
    @Step("I set invalid GET endpoints Carousel by Id")
    public String SetInvalidGETEndpointsCarouselById(){
        return url + "ccaousel/52";
    }
    @Step("I send invalid GET HTTP request Carousel by Id")
    public void SendInvalidGETHTTPRequestCarouselById(){
        SerenityRest.given().post(SetInvalidGETEndpointsCarouselById());
    }
}
