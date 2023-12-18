package StepDefinition.Customer.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetProductPreferences {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Product Preferences")
    public String SetGETEndpointsProductPreferences(){
        return url + "products/preferences";
    }
    @Step("I send GET HTTP request Product Preferences")
    public void SendGETHTTPRequestProductPreferences(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .when()
                .get(SetGETEndpointsProductPreferences());
    }

    @Step("I set invalid GET endpoints Product Preferences")
    public String SetInvalidGETEndpointsProductPreferences(){
        return url + "prroduct/5";
    }
    @Step("I send invalid GET HTTP request Preferences")
    public void SendInvalidGETHTTPRequestProductPreferences() {
        SerenityRest.given().post(SetInvalidGETEndpointsProductPreferences());
    }

}
