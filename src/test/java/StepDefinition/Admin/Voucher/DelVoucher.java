package StepDefinition.Admin.Voucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DelVoucher {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set DELETE endpoints delete voucher")
    public String setDeleteEndpoint(){
        return url + "vouchers/32";
    }

    @Step("I send DELETE HTTP request delete voucher")
    public void sendDeleteHttpRequestDeleteVoucher(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .delete(setDeleteEndpoint());
    }
}
