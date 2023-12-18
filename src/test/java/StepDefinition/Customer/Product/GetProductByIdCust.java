package StepDefinition.Customer.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductByIdCust {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Product by Id Cust")
    public String SetGETEndpointsProductByIdCust(){
        return url + "products/78";
    }
    @Step("I send GET HTTP request Product by Id Cust")
    public void SendGETHTTPRequestProductByIdCust(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .when()
                .get(SetGETEndpointsProductByIdCust());
    }

    @Step("I set invalid GET endpoints Product by Id Cust")
    public String SetInvalidGETEndpointsProductByIdCust(){
        return url + "prroduct/5";
    }
    @Step("I send invalid GET HTTP request Product by Id")
    public void SendInvalidGETHTTPRequestProductByIdCust() {
        SerenityRest.given().post(SetInvalidGETEndpointsProductByIdCust());
    }
}
