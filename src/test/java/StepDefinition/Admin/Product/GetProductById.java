package StepDefinition.Admin.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductById {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Product by Id")
    public String SetGETEndpointsProductById(){
        return url + "products/78";
    }
    @Step("I send GET HTTP request Product by Id")
    public void SendGETHTTPRequestProductById(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsProductById());
    }
    @Step("I send invalid GET HTTP request Product by Id forbidden")
    public void SendInvalidGETHTTPRequestProductByIdForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJAMlOWY")
                .when()
                .get(SetGETEndpointsProductById());
    }
    @Step("I set invalid GET endpoints Product by Id")
    public String SetInvalidGETEndpointsProductById(){
        return url + "prroduct/5";
    }
    @Step("I send invalid GET HTTP request Product by Id")
    public void SendInvalidGETHTTPRequestProductById() {
        SerenityRest.given().post(SetInvalidGETEndpointsProductById());
    }
}
