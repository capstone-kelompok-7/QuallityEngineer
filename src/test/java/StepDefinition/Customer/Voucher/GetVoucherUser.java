package StepDefinition.Customer.Voucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetVoucherUser {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Voucher User")
    public String SetGETEndpointsVoucherUser(){
        return url + "vouchers/users";
    }
    @Step("I send GET HTTP request Voucher User")
    public void SendGETHTTPRequestVoucherUser(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .when()
                .get(SetGETEndpointsVoucherUser());
    }
    @Step("I send invalid GET HTTP request Voucher User forbidden")
    public void SendInvalidGETHTTPRequestVoucherUserForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYUlbnN1cy5jb20iLCJuleHAiOjE3MDI4NzU2OTksImlhdCI6MTcwMjc4OTI5OSwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.hUGYs3bTFB5q8y6_y1XagjwmqmpvV2RaZUIgbuvRJzE")
                .when()
                .get(SetGETEndpointsVoucherUser());
    }
    @Step("I set invalid GET endpoints Voucher User")
    public String SetInvalidGETEndpointsVoucherUser(){
        return url + "vouchers/uses";
    }
    @Step("I send invalid GET HTTP request Voucher User")
    public void SendInvalidGETHTTPRequestVoucherUser(){
        SerenityRest.given().post(SetInvalidGETEndpointsVoucherUser());
    }
}
