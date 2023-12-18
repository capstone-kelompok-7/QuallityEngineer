package Steps.Admin;

import StepDefinition.Admin.Order.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Order {
    @Steps
    GetAllOrder getAllOrder;
    GetOrderById getOrderById = new GetOrderById();
    GetAllPayment getAllPayment = new GetAllPayment();
    PostConfirmOrder postConfirmOrder = new PostConfirmOrder();
    PostCancelOrder postCancelOrder = new PostCancelOrder();
    PutUpdateOrderStatus putUpdateOrderStatus = new PutUpdateOrderStatus();

    @Given("I set GET endpoints All Order")
    public void SetGETEndpointsAllOrder() {getAllOrder.SetGETEndpointsAllOrder();
    }

    @When("I send GET HTTP request All Order")
    public void iSendGETHTTPRequestAllOrder() {getAllOrder.SendGETHTTPRequestAllOrder();
    }

    @Given("I set invalid GET endpoints All Order")
    public void iSetInvalidGETEndpointsAllOrder() {getAllOrder.SetInvalidGETEndpointsAllOrder();
    }

    @When("I send invalid GET HTTP request All Order")
    public void iSendInvalidGETHTTPRequestAllOrder() {getAllOrder.SendInvalidGETHTTPRequestAllOrder();
    }

    @When("I send invalid GET HTTP request All Order forbidden")
    public void iSendInvalidGETHTTPRequestAllOrderForbidden() {getAllOrder.SendInvalidGETHTTPRequestAllOrderForbidden();
    }

    @Given("I set GET endpoints Order by Id")
    public void iSetGETEndpointsOrderById() {getOrderById.SetGETEndpointsOrderById();
    }

    @When("I send GET HTTP request Order by Id")
    public void iSendGETHTTPRequestOrderById() {getOrderById.SendGETHTTPRequestOrderById();
    }

    @When("I send invalid GET HTTP request Order by Id forbidden")
    public void iSendInvalidGETHTTPRequestOrderByIdForbidden() {getOrderById.SendInvalidGETHTTPRequestOrderByIdForbidden();
    }

    @Given("I set GET endpoints All Payment")
    public void iSetGETEndpointsAllPayment() {getAllPayment.SetGETEndpointsAllPayment();
    }

    @When("I send GET HTTP request All Payment")
    public void iSendGETHTTPRequestAllPayment() {getAllPayment.SendGETHTTPRequestAllPayment();
    }

    @When("I send invalid GET HTTP request All Payment forbidden")
    public void iSendInvalidGETHTTPRequestAllPaymentForbidden() {getAllPayment.SendInvalidGETHTTPRequestAllPaymentForbidden();
    }

    @Given("I set POST endpoints Confirm Payment")
    public void iSetPOSTEndpointsConfirmPayment() {postConfirmOrder.setPostApiEndpointConfirmOrder();
    }

    @When("I send POST HTTP request Confirm Payment")
    public void iSendPOSTHTTPRequestConfirmPayment() {postConfirmOrder.sendPostHttpRequestConfirmOrder();
    }

    @Given("I set POST endpoints Cancel Payment")
    public void iSetPOSTEndpointsCancelPayment() {postCancelOrder.setPostApiEndpointCancelOrder();
    }

    @When("I send POST HTTP request Cancel Payment")
    public void iSendPOSTHTTPRequestCancelPayment() {postCancelOrder.sendPostHttpRequestCancelOrder();
    }

    @Given("I set PUT endpoints Order Status")
    public void iSetPUTEndpointsOrderStatus() {
    }

    @When("I send PUT HTTP request Order Status")
    public void iSendPUTHTTPRequestOrderStatus() {
    }
}
