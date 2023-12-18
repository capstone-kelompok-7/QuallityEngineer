package StepDefinition.Admin.Category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.builder.MultiPartSpecBuilder;

import java.io.File;

public class PostCreateCategory {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set POST endpoints categories")
    public String setPostApiEndpointCategories(){
        return url + "categories";
    }

    @Step("I send POST HTTP request categories")
    public void sendPostHttpRequestCategories() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Tempat minum reusable");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointCategories());


    }
}
