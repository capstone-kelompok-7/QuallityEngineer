package StepDefinition.Admin.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetOrderById {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Order by Id")
    public String SetGETEndpointsOrderById(){
        return url + "order/d7169d14-1f34-4ef2-b408-49dca595efc6";
    }
    @Step("I send GET HTTP request Order by Id")
    public void SendGETHTTPRequestOrderById(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsOrderById());
    }
    @Step("I send invalid GET HTTP request Order by Id forbidden")
    public void SendInvalidGETHTTPRequestOrderByIdForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJAMlOWY")
                .when()
                .get(SetGETEndpointsOrderById());
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
