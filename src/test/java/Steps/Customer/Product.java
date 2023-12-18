package Steps.Customer;

import StepDefinition.Customer.Product.GetOtherProduct;
import StepDefinition.Customer.Product.GetProductByIdCust;
import StepDefinition.Customer.Product.GetProductPreferences;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Product {
    @Steps
    GetProductPreferences getProductPreferences;
    GetOtherProduct getOtherProduct = new GetOtherProduct();
    GetProductByIdCust getProductByIdCust = new GetProductByIdCust();

    @Given("I set GET endpoints Product Preferences")
    public void SetGETEndpointsProductPreferences() {getProductPreferences.SetGETEndpointsProductPreferences();
    }

    @When("I send GET HTTP request Product Preferences")
    public void iSendGETHTTPRequestProductPreferences() {getProductPreferences.SendGETHTTPRequestProductPreferences();
    }

    @Given("I set invalid GET endpoints Product Preferences")
    public void iSetInvalidGETEndpointsProductPreferences() {getProductPreferences.SetInvalidGETEndpointsProductPreferences();
    }

    @When("I send invalid GET HTTP request Product Preferences")
    public void iSendInvalidGETHTTPRequestProductPreferences() {getProductPreferences.SendInvalidGETHTTPRequestProductPreferences();
    }

    @Given("I set GET endpoints Other Products")
    public void iSetGETEndpointsOtherProducts() {getOtherProduct.SetGETEndpointsOtherProduct();
    }

    @When("I send GET HTTP request Other Products")
    public void iSendGETHTTPRequestOtherProducts() {getOtherProduct.SendGETHTTPRequestOtherProduct();
    }

    @Given("I set invalid GET endpoints OtherProducts")
    public void iSetInvalidGETEndpointsOtherProducts() {getOtherProduct.SetInvalidGETEndpointsOtherProduct();
    }

    @When("I send invalid GET HTTP request OtherProducts")
    public void iSendInvalidGETHTTPRequestOtherProducts() {getOtherProduct.SendInvalidGETHTTPRequestOtherProduct();
    }

    @Given("I set GET endpoints Product by Id Cust")
    public void iSetGETEndpointsProductByIdCust() {getProductByIdCust.SetGETEndpointsProductByIdCust();
    }

    @When("I send GET HTTP request Product by Id Cust")
    public void iSendGETHTTPRequestProductByIdCust() {getProductByIdCust.SendGETHTTPRequestProductByIdCust();
    }

    @Given("I set invalid GET endpoints Product by Id Cust")
    public void iSetInvalidGETEndpointsProductByIdCust() {getProductByIdCust.SetInvalidGETEndpointsProductByIdCust();
    }

    @When("I send invalid GET HTTP request Product by Id Cust")
    public void iSendInvalidGETHTTPRequestProductByIdCust() {getProductByIdCust.SendInvalidGETHTTPRequestProductByIdCust();
    }
}
