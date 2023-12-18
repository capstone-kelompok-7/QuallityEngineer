package StepDefinition.Customer.Voucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PostClaimsVoucher {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set POST endpoints Claims Voucher")
    public String setPostApiEndpointClaimsVoucher(){
        return url + "vouchers/claims";
    }

    @Step("I send POST HTTP request Claims Voucher")
    public void sendPostHttpRequestClaimsVoucher(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("voucher_id", 20);
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InBpamFkZTU5MjBAYXJlbnN1cy5jb20iLCJleHAiOjE3MDI5NjIzMDEsImlhdCI6MTcwMjg3NTkwMSwicm9sZSI6ImN1c3RvbWVyIiwidXNlcl9pZCI6Mjd9.hZwS0q9nNKt6MNEotKe0X6ZsJ-gpIBuPq2wnqj1QS6Q")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointClaimsVoucher());
        }
    }



