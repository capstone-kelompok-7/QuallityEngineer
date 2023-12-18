package StepDefinition.Admin.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllPayment {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All Payment")
    public String SetGETEndpointsAllPayment(){
        return url + "order/payment";
    }
    @Step("I send GET HTTP request All Payment")
    public void SendGETHTTPRequestAllPayment(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsAllPayment());
    }
    @Step("I send invalid GET HTTP request All Payment forbidden")
    public void SendInvalidGETHTTPRequestAllPaymentForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJAMlOWY")
                .when()
                .get(SetGETEndpointsAllPayment());
    }
    @Step("I set invalid GET endpoints Order by Id")
    public String SetInvalidGETEndpointsOrderById(){
        return url + "Orde/5";
    }
    @Step("I send invalid GET HTTP request Order by Id")
    public void SendInvalidGETHTTPRequestOrderById() {
        SerenityRest.given().post(SetInvalidGETEndpointsOrderById());
    }
}
