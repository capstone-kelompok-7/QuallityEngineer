package Steps.Admin;

import StepDefinition.Admin.Voucher.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Voucher {
    @Steps
    GetAllVoucher getAllVoucher;
    GetVoucherById getVoucherById = new GetVoucherById();
    PostCreateVoucher postCreateVoucher = new PostCreateVoucher();
    PutUpdateVoucher putUpdateVoucher = new PutUpdateVoucher();
    DelVoucher delVoucher = new DelVoucher();

    @Given("I set GET endpoints All Voucher")
    public void SetGETEndpointsAllVoucher() {getAllVoucher.SetGETEndpointsAllVoucher();
    }

    @When("I send GET HTTP request All Voucher")
    public void iSendGETHTTPRequestAllVoucher() {getAllVoucher.SendGETHTTPRequestAllVoucher();
    }

    @Given("I set invalid GET endpoints All Voucher")
    public void iSetInvalidGETEndpointsAllVoucher() {getAllVoucher.SetInvalidGETEndpointsAllVoucher();
    }

    @When("I send invalid GET HTTP request All Voucher")
    public void iSendInvalidGETHTTPRequestAllVoucher() {getAllVoucher.SendInvalidGETHTTPRequestAllVoucher();
    }

    @When("I send invalid GET HTTP request All Voucher forbidden")
    public void iSendInvalidGETHTTPRequestAllVoucherForbidden() {getAllVoucher.SendInvalidGETHTTPRequestAllVoucherForbidden();
    }

    @Given("I set GET endpoints Voucher by Id")
    public void iSetGETEndpointsVoucherById() {getVoucherById.SetGETEndpointsVoucherById();
    }

    @When("I send GET HTTP request Voucher by Id")
    public void iSendGETHTTPRequestVoucherById() {getVoucherById.SendGETHTTPRequestVoucherById();
    }

    @Given("I set invalid GET endpoints Voucher by Id")
    public void iSetInvalidGETEndpointsVoucherById() {getVoucherById.SetInvalidGETEndpointsVoucherById();
    }

    @When("I send invalid GET HTTP request Voucher by Id")
    public void iSendInvalidGETHTTPRequestVoucherById() {getVoucherById.SendInvalidGETHTTPRequestVoucherById();
    }

    @Given("I set POST endpoints Voucher")
    public void iSetPOSTEndpointsVoucher() {postCreateVoucher.setPostApiEndpointVoucher();
    }

    @When("I send POST HTTP request Voucher")
    public void iSendPOSTHTTPRequestVoucher() {postCreateVoucher.sendPostHttpRequestVoucher();
    }

    @Given("I set PUT endpoints update Voucher")
    public void iSetPUTEndpointsUpdateVoucher() {putUpdateVoucher.setPutApiUpdateVoucher();
    }

    @When("I send PUT HTTP request update Voucher")
    public void iSendPUTHTTPRequestUpdateVoucher() {putUpdateVoucher.sendPostHttpRequestVoucher();
    }

    @Given("I set DELETE endpoints delete voucher")
    public void iSetDELETEEndpointsDeleteVoucher() {delVoucher.setDeleteEndpoint();
    }

    @When("I send DELETE HTTP request delete voucher")
    public void iSendDELETEHTTPRequestDeleteVoucher() {delVoucher.sendDeleteHttpRequestDeleteVoucher();
    }
}
