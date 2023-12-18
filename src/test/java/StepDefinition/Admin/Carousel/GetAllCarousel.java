package StepDefinition.Admin.Carousel;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllCarousel {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All Carousel")
    public String SetGETEndpointsAllCarousel(){
        return url + "carousel";
    }
    @Step("I send GET HTTP request All Carousel")
    public void SendGETHTTPRequestAllCarousel(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsAllCarousel());
    }
    @Step("I send invalid GET HTTP request All Carousel forbidden")
    public void SendInvalidGETHTTPRequestAllCarouselForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsAllCarousel());
    }
    @Step("I set invalid GET endpoints All Category")
    public String SetInvalidGETEndpointsAllCategory(){
        return url + "carusel";
    }
    @Step("I send invalid GET HTTP request All Category")
    public void SendInvalidGETHTTPRequestAllCategory(){
        SerenityRest.given().post(SetInvalidGETEndpointsAllCategory());
    }
}
