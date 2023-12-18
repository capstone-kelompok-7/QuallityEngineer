package StepDefinition.Admin.Voucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetVoucherById {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Voucher by Id")
    public String SetGETEndpointsVoucherById(){
        return url + "vouchers/11";
    }
    @Step("I send GET HTTP request Voucher by Id")
    public void SendGETHTTPRequestVoucherById(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsVoucherById());
    }
    @Step("I send invalid GET HTTP request Voucher by Id forbidden")
    public void SendInvalidGETHTTPRequestVoucherByIdForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJAMlOWY")
                .when()
                .get(SetGETEndpointsVoucherById());
    }
    @Step("I set invalid GET endpoints Voucher by Id")
    public String SetInvalidGETEndpointsVoucherById(){
        return url + "ctegories/5";
    }
    @Step("I send invalid GET HTTP request Voucher by Id")
    public void SendInvalidGETHTTPRequestVoucherById() {
        SerenityRest.given().post(SetInvalidGETEndpointsVoucherById());
    }
}
