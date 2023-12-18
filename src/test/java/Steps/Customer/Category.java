package Steps.Customer;

import StepDefinition.Customer.Category.GetAllCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Category {
    @Steps
    GetAllCategory getAllCategory;

    @Given("I set GET endpoints All Category Customer")
    public void SetGETEndpointsAllCategoryCustomer() {getAllCategory.SetGETEndpointsAllCategory();
    }

    @When("I send GET HTTP request All Category Customer")
    public void iSendGETHTTPRequestAllCategoryCustomer() {getAllCategory.SendGETHTTPRequestAllCategory();
    }

    @Given("I set invalid GET endpoints All Category Customer")
    public void iSetInvalidGETEndpointsAllCategoryCustomer() {getAllCategory.SetInvalidGETEndpointsAllCategory();
    }

    @When("I send invalid GET HTTP request All Category Customer")
    public void iSendInvalidGETHTTPRequestAllCategoryCustomer() {getAllCategory.SendInvalidGETHTTPRequestAllCategory();
    }

    @When("I send invalid GET HTTP request All Category Customer forbidden")
    public void iSendInvalidGETHTTPRequestAllCategoryCustomerForbidden() {getAllCategory.SendInvalidGETHTTPRequestAllCategoryForbidden();
    }
}
