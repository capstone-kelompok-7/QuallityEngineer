package StepDefinition.Admin.Voucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetAllVoucher {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints All Voucher")
    public String SetGETEndpointsAllVoucher(){
        return url + "vouchers";
    }
    @Step("I send GET HTTP request All Voucher")
    public void SendGETHTTPRequestAllVoucher(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsAllVoucher());
    }
    @Step("I send invalid GET HTTP request All Voucher forbidden")
    public void SendInvalidGETHTTPRequestAllVoucherForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsAllVoucher());
    }
    @Step("I set invalid GET endpoints All Voucher")
    public String SetInvalidGETEndpointsAllVoucher(){
        return url + "poucher";
    }
    @Step("I send invalid GET HTTP request All Voucher")
    public void SendInvalidGETHTTPRequestAllVoucher(){
        SerenityRest.given().post(SetInvalidGETEndpointsAllVoucher());
    }
}
