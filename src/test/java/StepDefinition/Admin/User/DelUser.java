package StepDefinition.Admin.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DelUser {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set DELETE endpoints delete User")
    public String setDeleteEndpointUser(){
        return url + "users/30";
    }

    @Step("I send DELETE HTTP request delete User")
    public void sendDeleteHttpRequestDeleteUser(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .delete(setDeleteEndpointUser());
    }
}
