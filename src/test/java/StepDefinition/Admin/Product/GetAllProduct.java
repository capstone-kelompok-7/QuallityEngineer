package StepDefinition.Admin.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllProduct {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All Product")
    public String SetGETEndpointsAllProduct(){
        return url + "products";
    }
    @Step("I send GET HTTP request All Product")
    public void SendGETHTTPRequestAllProduct(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsAllProduct());
    }
//    @Step("I send invalid GET HTTP request All Product forbidden")
//    public void SendInvalidGETHTTPRequestAllProductForbidden(){
//        SerenityRest.given()
//                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI4NzU2OTksImlhdCI6MTcwMjc4OTI5OSwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.hUGYs3bTFB5q8y6_y1XagjwmqmpvV2RaZUIgbuvRJzE")
//                .when()
//                .get(SetGETEndpointsAllProduct());
//    }
    @Step("I set invalid GET endpoints All Product")
    public String SetInvalidGETEndpointsAllProduct(){
        return url + "produk";
    }
    @Step("I send invalid GET HTTP request All Product")
    public void SendInvalidGETHTTPRequestAllProduct(){
        SerenityRest.given().post(SetInvalidGETEndpointsAllProduct());
    }
}
