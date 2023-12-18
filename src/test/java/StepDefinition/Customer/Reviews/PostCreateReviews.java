package StepDefinition.Customer.Reviews;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PostCreateReviews {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set POST endpoints Reviews")
    public String setPostApiEndpointReviews() {
        return url + "reviews";
    }

    @Step("I send POST HTTP request Reviews")
    public void sendPostHttpRequestReviews() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 142);
        requestBody.put("rating", 5);
        requestBody.put("description", "bagus sekali");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5MzczNzAsImlhdCI6MTcwMjg1MDk3MCwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.z8xk3tOTSrulwSRMDkFKp27pw3jLeBz_3ojgwk8yqJY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointReviews());
    }

    @Step("I set POST invalid endpoints Reviews")
    public String setPostApiInvalidEndpointReviews() {
        return url + "ripiu";
    }

    @Step("I send invalid POST HTTP request Reviews")
    public void sendInvalidPostHttpRequestReviews() {
        SerenityRest.given().post(setPostApiInvalidEndpointReviews());
    }
}
