package StepDefinition.Admin.Order;

import net.thucydides.core.annotations.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.UUID;

public class PostConfirmOrder {
    static {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set POST endpoints Confirm Order")
    public String setPostApiEndpointConfirmOrder(){
        return url + "order/confirm";
    }

    @Step("I send POST HTTP request Confirm Order")
    public void sendPostHttpRequestConfirmOrder(){
        UUID id = UUID.fromString("d7169d14-1f34-4ef2-b408-49dca595efc6");

         RestAssured.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjkyMzI5MCwiaWF0IjoxNzAyODM2ODkwLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.hSCvVg_eaXJiwai7npri-niQRCiNWLoujbzLd3OE_pw")
                .formParam("id", id.toString())
                .when()
                .post(setPostApiEndpointConfirmOrder())
                 .then().statusCode(200);

        try {
            RestAssured.given()
                    .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                    .formParam("id", id.toString())
                    .when()
                    .post(setPostApiEndpointConfirmOrder())
                    .then().statusCode(200);
        } catch (Exception e) {
            // Tangkap dan cetak informasi kesalahan
            e.printStackTrace();
        }

    }

}
