package StepDefinition.Admin.Carousel;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PutUpdateCarousel {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set PUT endpoints Update Carousel")
    public String setPostApiEndpointUpdateCarousel(){
        return url +  "carousel/63";
    }

    @Step("I send PUT HTTP request Update Carousel")
    public void sendPutHttpRequestUpdateCarousel() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Tempat minum");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .put(setPostApiEndpointUpdateCarousel());
    }
}
