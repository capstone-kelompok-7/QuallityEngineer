package StepDefinition.Customer.Category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllCategory {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All Category")
    public String SetGETEndpointsAllCategory(){
        return url + "categories?page=1";
    }
    @Step("I send GET HTTP request All Category")
    public void SendGETHTTPRequestAllCategory(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .when()
                .get(SetGETEndpointsAllCategory());
    }
    @Step("I send invalid GET HTTP request All Category forbidden")
    public void SendInvalidGETHTTPRequestAllCategoryForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYUlbnN1cy5jb20iLCJuleHAiOjE3MDI4NzU2OTksImlhdCI6MTcwMjc4OTI5OSwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.hUGYs3bTFB5q8y6_y1XagjwmqmpvV2RaZUIgbuvRJzE")
                .when()
                .get(SetGETEndpointsAllCategory());
    }
    @Step("I set invalid GET endpoints All Category")
    public String SetInvalidGETEndpointsAllCategory(){
        return url + "ctegories?search";
    }
    @Step("I send invalid GET HTTP request All Category")
    public void SendInvalidGETHTTPRequestAllCategory(){
        SerenityRest.given().post(SetInvalidGETEndpointsAllCategory());
    }
}
