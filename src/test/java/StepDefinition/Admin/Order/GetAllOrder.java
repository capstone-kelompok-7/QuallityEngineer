package StepDefinition.Admin.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllOrder {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All Order")
    public String SetGETEndpointsAllOrder(){
        return url + "order";
    }
    @Step("I send GET HTTP request All Order")
    public void SendGETHTTPRequestAllOrder(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsAllOrder());
    }
    @Step("I send invalid GET HTTP request All Order forbidden")
    public void SendInvalidGETHTTPRequestAllOrderForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsAllOrder());
    }
    @Step("I set invalid GET endpoints All Order")
    public String SetInvalidGETEndpointsAllOrder(){
        return url + "Ordr";
    }
    @Step("I send invalid GET HTTP request All Order")
    public void SendInvalidGETHTTPRequestAllOrder(){
        SerenityRest.given().post(SetInvalidGETEndpointsAllOrder());
    }
}

