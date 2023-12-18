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

public class PUTUpdateCategory {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set PUT endpoints Update Category")
    public String setPostApiEndpointUpdateCategory(){
        return url +  "categories/49";
    }

    @Step("I send PUT HTTP request Update Category")
    public void sendPutHttpRequestUpdateCategory() {
            JSONObject requestBody = new JSONObject();
            requestBody.put("name", "Tempat minum");
            SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                    .header("Content-Type", "application/json")
                    .body(requestBody.toJSONString())
                    .put(setPostApiEndpointUpdateCategory());
    }
}
