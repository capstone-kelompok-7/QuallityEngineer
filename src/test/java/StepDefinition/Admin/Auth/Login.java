package StepDefinition.Admin.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected String url = "https://test.disappear-organization.my.id/api/v1/";
    @Step("I set POST endpoints login")
    public String setPostEndpointLogin(){
        return url + "auth/login";
    }

    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "admin@gmail.com");
        requestBody.put("Password", "admin123");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMTk0MjA2MSwiaWF0IjoxNzAxODU1NjYxLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.2a0uxMZ9fHTFUt4yv3dTctBUFV4GjDaJM7SRmftap1Q")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostEndpointLogin());
    }
    @Step("I set POST invalid endpoints login")
    public String setPostApiInvalidEndpointLogin(){
        return url + "login";
    }

    @Step("I send invalid POST HTTP request login")
    public void sendInvalidPostHttpRequestLogin(){
        SerenityRest.given().post(setPostApiInvalidEndpointLogin());
    }
    @Step("I send invalid POST HTTP request login error validating")
    public void sendInvalidPostHttpRequestLoginErrorValidating(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "test2@mail.com");
        requestBody.put("Password", "");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMTk0MjA2MSwiaWF0IjoxNzAxODU1NjYxLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.2a0uxMZ9fHTFUt4yv3dTctBUFV4GjDaJM7SRmftap1Q").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostEndpointLogin());
    }
    @Step("I send invalid POST HTTP request login user not found")
    public void sendInvalidPOSTHTTPRequestLoginUserNotFound(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "test2@mail.com");
        requestBody.put("Password", "admin123");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMTk0MjA2MSwiaWF0IjoxNzAxODU1NjYxLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.2a0uxMZ9fHTFUt4yv3dTctBUFV4GjDaJM7SRmftap1Q").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostEndpointLogin());
    }
    @Step("I send invalid POST HTTP request login error binding")
    public void SendInvalidPOSTHTTPRequestLoginErrorBinding(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "test2@mail.com");
        requestBody.put("Password", 12313);
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMTk0MjA2MSwiaWF0IjoxNzAxODU1NjYxLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.2a0uxMZ9fHTFUt4yv3dTctBUFV4GjDaJM7SRmftap1Q").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostEndpointLogin());
    }
    @Step("I send invalid POST HTTP request login invalid credential")
    public void SendInvalidPOSTHTTPRequestLoginInvalidCredential(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "anan@mail.com");
        requestBody.put("Password", "12313");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMTk0MjA2MSwiaWF0IjoxNzAxODU1NjYxLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.2a0uxMZ9fHTFUt4yv3dTctBUFV4GjDaJM7SRmftap1Q").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostEndpointLogin());
    }
    @Step("I send invalid POST HTTP request login account not verified")
    public void SendInvalidPOSTHTTPRequestLoginAccountNotVerified(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("Email", "ramarama@mail.com");
        requestBody.put("Password", "admin123");
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsImV4cCI6MTcwMTk0MjA2MSwiaWF0IjoxNzAxODU1NjYxLCJyb2xlIjoiYWRtaW4iLCJ1c2VyX2lkIjoxfQ.2a0uxMZ9fHTFUt4yv3dTctBUFV4GjDaJM7SRmftap1Q").header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostEndpointLogin());
    }

    @Step("I receive valid HTTP response code 200")
    public void ReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code 201")
    public void ReceiveValidHTTPResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid HTTP response code 400")
    public void ReceiveValidHTTPResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I receive valid HTTP response code 404")
    public void ReceiveValidHTTPResponseCode404(){restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I receive valid HTTP response code 401")
    public void ReceiveValidHTTPResponseCode401(){restAssuredThat(response -> response.statusCode(401));
    }
    @Step("I receive valid HTTP response code 405")
    public void ReceiveValidHTTPResponseCode405(){restAssuredThat(response -> response.statusCode(405));
    }
}
