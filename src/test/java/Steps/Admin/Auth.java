package Steps.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import StepDefinition.Admin.Auth.Login;
import net.thucydides.core.annotations.Steps;

public class Auth {

    @Steps
    Login login;

    @Given("I set POST endpoints login")
    public void SetPOSTEndpointsLogin() { login.setPostEndpointLogin();
    }

    @When("I send POST HTTP request login")
    public void SendPOSTHTTPRequestLogin() { login.sendPostHttpRequestLogin();
    }

    @Then("I receive valid HTTP response code 200")
    public void ReceiveValidHTTPResponseCode200() {login.ReceiveValidHTTPResponseCode200();
    }

    @Given("I set POST invalid endpoints login")
    public void SetPOSTInvalidEndpointsLogin() { login.setPostApiInvalidEndpointLogin();
    }

    @When("I send invalid POST HTTP request login")
    public void SendInvalidPOSTHTTPRequestLogin() {login.sendInvalidPostHttpRequestLogin();
    }

    @When("I send invalid POST HTTP request login error validating")
    public void SendInvalidPOSTHTTPRequestLoginErrorValidating() {login.sendInvalidPostHttpRequestLoginErrorValidating();
    }

    @Then("I receive valid HTTP response code 400")
    public void iReceiveValidHTTPResponseCode400() {login.ReceiveValidHTTPResponseCode400();
    }

    @Then("I receive valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404() {login.ReceiveValidHTTPResponseCode404();
    }

    @Then("I receive valid HTTP response code 401")
    public void iReceiveValidHTTPResponseCode401() {login.ReceiveValidHTTPResponseCode401();
    }

    @When("I send invalid POST HTTP request login user not found")
    public void SendInvalidPOSTHTTPRequestLoginUserNotFound() {login.sendInvalidPOSTHTTPRequestLoginUserNotFound();
    }

    @When("I send invalid POST HTTP request login error binding")
    public void SendInvalidPOSTHTTPRequestLoginErrorBinding() {login.SendInvalidPOSTHTTPRequestLoginErrorBinding();
    }

    @When("I send invalid POST HTTP request login invalid credential")
    public void SendInvalidPOSTHTTPRequestLoginInvalidCredential() {login.SendInvalidPOSTHTTPRequestLoginInvalidCredential();
    }

    @When("I send invalid POST HTTP request login account not verified")
    public void SendInvalidPOSTHTTPRequestLoginAccountNotVerified() {
    }

    @Then("I receive valid HTTP response code 201")
    public void iReceiveValidHTTPResponseCode201() {login.ReceiveValidHTTPResponseCode201();
    }

    @Then("I receive valid HTTP response code 405")
    public void iReceiveValidHTTPResponseCode405() {login.ReceiveValidHTTPResponseCode405();
    }


}
