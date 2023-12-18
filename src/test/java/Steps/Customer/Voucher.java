package Steps.Customer;

import StepDefinition.Customer.Voucher.GetVoucherToClaims;
import StepDefinition.Customer.Voucher.GetVoucherUser;
import StepDefinition.Customer.Voucher.PostClaimsVoucher;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Voucher {
    @Steps
    GetVoucherUser getVoucherUser;
    GetVoucherToClaims getVoucherToClaims = new GetVoucherToClaims();
    PostClaimsVoucher postClaimsVoucher = new PostClaimsVoucher();

    @Given("I set GET endpoints Voucher User")
    public void SetGETEndpointsVoucherUser() {getVoucherUser.SetGETEndpointsVoucherUser();
    }

    @When("I send GET HTTP request Voucher User")
    public void iSendGETHTTPRequestVoucherUser() {getVoucherUser.SendGETHTTPRequestVoucherUser();
    }

    @Given("I set invalid GET endpoints Voucher User")
    public void iSetInvalidGETEndpointsVoucherUser() {getVoucherUser.SetInvalidGETEndpointsVoucherUser();
    }

    @When("I send invalid GET HTTP request Voucher User")
    public void iSendInvalidGETHTTPRequestVoucherUser() {getVoucherUser.SendInvalidGETHTTPRequestVoucherUser();
    }

    @When("I send invalid GET HTTP request Voucher User forbidden")
    public void iSendInvalidGETHTTPRequestVoucherUserForbidden() {getVoucherUser.SendInvalidGETHTTPRequestVoucherUserForbidden();
    }

    @Given("I set GET endpoints Voucher To Claims")
    public void iSetGETEndpointsVoucherToClaims() {getVoucherToClaims.SetGETEndpointsVoucherToClaims();
    }

    @When("I send GET HTTP request Voucher To Claims")
    public void iSendGETHTTPRequestVoucherToClaims() {getVoucherToClaims.SendGETHTTPRequestVoucherToClaims();
    }

    @Given("I set invalid GET endpoints Voucher To Claims")
    public void iSetInvalidGETEndpointsVoucherToClaims() {getVoucherToClaims.SetInvalidGETEndpointsVoucherToClaims();
    }

    @When("I send invalid GET HTTP request Voucher To Claims")
    public void iSendInvalidGETHTTPRequestVoucherToClaims() {getVoucherToClaims.SendInvalidGETHTTPRequestVoucherToClaims();
    }

    @Given("I set POST endpoints Claims Voucher")
    public void iSetPOSTEndpointsClaimsVoucher() {postClaimsVoucher.setPostApiEndpointClaimsVoucher();
    }

    @When("I send POST HTTP request Claims Voucher")
    public void iSendPOSTHTTPRequestClaimsVoucher() {postClaimsVoucher.sendPostHttpRequestClaimsVoucher();
    }
}
