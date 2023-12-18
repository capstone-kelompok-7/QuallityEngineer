package StepDefinition.Admin.Order;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

import java.util.UUID;

public class PostCancelOrder {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set POST endpoints Cancel Order")
    public String setPostApiEndpointCancelOrder(){
        return url + "order/confirm/d7169d14-1f34-4ef2-b408-49dca595efc6";
    }

    @Step("I send POST HTTP request Cancel Order")
    public void sendPostHttpRequestCancelOrder(){
        UUID id = UUID.fromString("d7169d14-1f34-4ef2-b408-49dca595efc6");

        Response response = RestAssured.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .formParam("id", id.toString())
                .when()
                .post(setPostApiEndpointCancelOrder());

    }
}
