package StepDefinition.Admin.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DelProduct {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set DELETE endpoints delete Product")
    public String setDeleteEndpointProduct(){
        return url + "products/149";
    }

    @Step("I send DELETE HTTP request delete Product")
    public void sendDeleteHttpRequestDeleteProduct(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .delete(setDeleteEndpointProduct());
    }
}
