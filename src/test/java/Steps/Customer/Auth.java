package Steps.Customer;

import StepDefinition.Customer.Auth.PostLoginCustomer;
import StepDefinition.Customer.Auth.PostRegister;
import StepDefinition.Customer.Auth.PostResendOTP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Auth {
    @Steps
    PostRegister postRegister;
    PostLoginCustomer postLoginCustomer = new PostLoginCustomer();
    PostResendOTP resendOTP = new PostResendOTP();

    @Given("I set POST endpoints Register")
    public void iSetPOSTEndpointsRegister() {postRegister.setPostEndpointRegister();
    }

    @When("I send POST HTTP request Register")
    public void iSendPOSTHTTPRequestRegister() {postRegister.sendPostHttpRequestRegister();
    }

    @Given("I set POST invalid endpoints Register")
    public void iSetPOSTInvalidEndpointsRegister() {postRegister.setPostApiInvalidEndpointRegister();
    }

    @When("I send invalid POST HTTP request Register")
    public void iSendInvalidPOSTHTTPRequestRegister() {postRegister.sendInvalidPostHttpRequestRegister();
    }

    @Given("I set POST endpoints login customer")
    public void SetPOSTEndpointsLoginCustomer() {postLoginCustomer.setPostEndpointLoginCustomer();
    }

    @When("I send POST HTTP request login customer")
    public void iSendPOSTHTTPRequestLoginCustomer() {postLoginCustomer.sendPostHttpRequestLoginCustomer();
    }

    @Given("I set POST invalid endpoints login customer")
    public void iSetPOSTInvalidEndpointsLoginCustomer() {postLoginCustomer.setPostApiInvalidEndpointLoginCustomer();
    }

    @When("I send invalid POST HTTP request login customer")
    public void iSendInvalidPOSTHTTPRequestLoginCustomer() {postLoginCustomer.sendInvalidPostHttpRequestLoginCustomer();
    }

    @Given("I set POST endpoints resend OTP")
    public void iSetPOSTEndpointsResendOTP() {resendOTP.setPostEndpointResendOTP();
    }

    @When("I send POST HTTP request resend OTP")
    public void iSendPOSTHTTPRequestResendOTP() {resendOTP.sendPostHttpRequestResendOTP();
    }

    @Given("I set POST invalid resend OTP")
    public void iSetPOSTInvalidResendOTP() {resendOTP.setPostEndpointResendOTP();
    }

    @When("I send invalid POST HTTP resend OTP")
    public void iSendInvalidPOSTHTTPResendOTP() {resendOTP.sendInvalidPostHttpRequestResendOTP();
    }
}
