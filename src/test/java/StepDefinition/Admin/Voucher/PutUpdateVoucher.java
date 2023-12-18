package StepDefinition.Admin.Voucher;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class PutUpdateVoucher {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set PUT endpoints update Voucher")
    public String setPutApiUpdateVoucher(){
        return url + "vouchers/19";
    }

    @Step("I send PUT HTTP request update Voucher")
    public void sendPostHttpRequestVoucher(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Voucher Baru");
        requestBody.put("code", "CODE123ASD09");
        requestBody.put("category", "All Customer");
        requestBody.put("description", "Diskon untuk semua produk");
        requestBody.put("discount", 2000);
        requestBody.put("start_date", "2023-11-15T00:00:00Z");
        requestBody.put("end_date", "2023-12-30T00:00:00Z");
        requestBody.put("min_purchase", 2000);
        requestBody.put("stock", 100);
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .put(setPutApiUpdateVoucher());
    }
}
