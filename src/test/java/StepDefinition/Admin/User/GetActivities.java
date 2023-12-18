package StepDefinition.Admin.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GetActivities {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set GET endpoints Activities")
    public String SetGETEndpointsActivities(){
        return url + "users/24";
    }
    @Step("I send GET HTTP request Activities")
    public void SendGETHTTPRequestActivities(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjkyMzI5MCwiaWF0IjoxNzAyODM2ODkwLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.hSCvVg_eaXJiwai7npri-niQRCiNWLoujbzLd3OE_pw")
                .when()
                .get(SetGETEndpointsActivities());
    }
    @Step("I send invalid GET HTTP request Activities forbidden")
    public void SendInvalidGETHTTPRequestActivitiesForbidden(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjA5Mzc1OCwiaWF0IjoxNzAyMDA3MzU4LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.k3BVYqqZeapZDfVX6fr5vP7bKEuYZTCDKDBAGCpGwbs")
                .when()
                .get(SetGETEndpointsActivities());
    }
}
