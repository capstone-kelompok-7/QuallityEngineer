package StepDefinition.Customer.Voucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetVoucherToClaims {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Voucher To Claims")
    public String SetGETEndpointsVoucherToClaims(){
        return url + "vouchers/to-claims";
    }
    @Step("I send GET HTTP request Voucher ToC laims")
    public void SendGETHTTPRequestVoucherToClaims(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .when()
                .get(SetGETEndpointsVoucherToClaims());
    }
    @Step("I send invalid GET HTTP request Voucher To Claims forbidden")
    public void SendInvalidGETHTTPRequestVoucherToClaimsForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYUlbnN1cy5jb20iLCJuleHAiOjE3MDI4NzU2OTksImlhdCI6MTcwMjc4OTI5OSwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.hUGYs3bTFB5q8y6_y1XagjwmqmpvV2RaZUIgbuvRJzE")
                .when()
                .get(SetGETEndpointsVoucherToClaims());
    }
    @Step("I set invalid GET endpoints Voucher To Claims")
    public String SetInvalidGETEndpointsVoucherToClaims(){
        return url + "vouchers/to-clim";
    }
    @Step("I send invalid GET HTTP request Voucher To Claims")
    public void SendInvalidGETHTTPRequestVoucherToClaims(){
        SerenityRest.given().post(SetInvalidGETEndpointsVoucherToClaims());
    }
}
