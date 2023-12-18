package StepDefinition.Admin.Carousel;

import io.restassured.RestAssured;
import io.restassured.builder.MultiPartSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.MultiPartSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.io.File;

public class PostCreateCarousel {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set POST endpoints Create Carousel")
    public String setPostApiEndpointCreateCarousel(){
        return url + "carousel";
    }

    @Step("I send POST HTTP request Create Carousel")
    public void sendPostHttpRequestCreateCarousel() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Lets Go Green");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointCreateCarousel());

    }
}
