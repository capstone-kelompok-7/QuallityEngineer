package StepDefinition.Admin.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PostCreateProduct {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";

    @Step("I set POST endpoints Product")
    public String setPostApiEndpointProduct(){
        return url + "products";
    }

    @Step("I send POST HTTP request Product")
    public void sendPostHttpRequestProduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Alat Makan Eco Environment");
        requestBody.put("description", "Alat Makan  bebas bahan kimia jahat");
        requestBody.put("gram_plastic", 150);
        requestBody.put("price", 75000);
        requestBody.put("stock", 100);
        requestBody.put("discount", 5000);
        requestBody.put("exp", 40);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(37);
        requestBody.put("categories", categoriesArray);
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMjg5ODE0NCwiaWF0IjoxNzAyODExNzQ0LCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.GSIRJZlnifl0TVbSpzvRHSglJP0GWQLkkHKSJlMaOWY")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointProduct());
    }
}
