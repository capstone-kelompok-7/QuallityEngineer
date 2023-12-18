package Steps.Admin;

import StepDefinition.Admin.Product.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Product {
    @Steps
    GetAllProduct getAllProduct;
    GetProductById getProductById = new GetProductById();
    PostCreateProduct postCreateProduct = new PostCreateProduct();
    PutUpdateProduct putUpdateProduct = new PutUpdateProduct();
    DelProduct delProduct = new DelProduct();

    @Given("I set GET endpoints All Product")
    public void SetGETEndpointsAllProduct() {getAllProduct.SetGETEndpointsAllProduct();
    }

    @When("I send GET HTTP request All Product")
    public void iSendGETHTTPRequestAllProduct() {getAllProduct.SendGETHTTPRequestAllProduct();
    }

    @Given("I set invalid GET endpoints All Product")
    public void iSetInvalidGETEndpointsAllProduct() {getAllProduct.SetInvalidGETEndpointsAllProduct();
    }

    @When("I send invalid GET HTTP request All Product")
    public void iSendInvalidGETHTTPRequestAllProduct() {getAllProduct.SendInvalidGETHTTPRequestAllProduct();
    }

//    @When("I send invalid GET HTTP request All Product forbidden")
//    public void iSendInvalidGETHTTPRequestAllProductForbidden() {getAllProduct.SendInvalidGETHTTPRequestAllProductForbidden();
//    }

    @Given("I set GET endpoints Product by Id")
    public void iSetGETEndpointsProductById() {getProductById.SetGETEndpointsProductById();
    }

    @When("I send GET HTTP request Product by Id")
    public void iSendGETHTTPRequestProductById() {getProductById.SendGETHTTPRequestProductById();
    }

    @Given("I set invalid GET endpoints Product by Id")
    public void iSetInvalidGETEndpointsProductById() {getProductById.SetInvalidGETEndpointsProductById();
    }

    @When("I send invalid GET HTTP request Product by Id")
    public void iSendInvalidGETHTTPRequestProductById() {getProductById.SendInvalidGETHTTPRequestProductById();
    }

    @Given("I set POST endpoints Product")
    public void iSetPOSTEndpointsProduct() {postCreateProduct.setPostApiEndpointProduct();
    }

    @When("I send POST HTTP request Product")
    public void iSendPOSTHTTPRequestProduct() {postCreateProduct.sendPostHttpRequestProduct();
    }

    @Given("I set PUT endpoints update Product")
    public void iSetPUTEndpointsUpdateProduct() {putUpdateProduct.setPutApiUpdateProduct();
    }

    @When("I send PUT HTTP request update Product")
    public void iSendPUTHTTPRequestUpdateProduct() {putUpdateProduct.sendPutHttpRequestUpdateProduct();
    }

    @Given("I set DELETE endpoints delete Product")
    public void iSetDELETEEndpointsDeleteProduct() {delProduct.setDeleteEndpointProduct();
    }

    @When("I send DELETE HTTP request delete Product")
    public void iSendDELETEHTTPRequestDeleteProduct() {delProduct.sendDeleteHttpRequestDeleteProduct();
    }
}
