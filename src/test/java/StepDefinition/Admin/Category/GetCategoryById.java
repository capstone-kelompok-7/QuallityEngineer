package StepDefinition.Admin.Category;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetCategoryById {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Category by Id")
    public String SetGETEndpointsCategoryById(){
        return url + "categories/4";
    }
    @Step("I send GET HTTP request Category by Id")
    public void SendGETHTTPRequestCategoryById(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .when()
                .get(SetGETEndpointsCategoryById());
    }
    @Step("I send invalid GET HTTP request Category by Id forbidden")
    public void SendInvalidGETHTTPRequestCategoryByIdForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsCategoryById());
    }
    @Step("I set invalid GET endpoints Category by Id")
    public String SetInvalidGETEndpointsCategoryById(){
        return url + "ctegories/5";
    }
    @Step("I send invalid GET HTTP request Category by Id")
    public void SendInvalidGETHTTPRequestCategoryById(){
        SerenityRest.given().post(SetInvalidGETEndpointsCategoryById());
    }
}
