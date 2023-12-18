package Steps.Admin;

import StepDefinition.Admin.Category.GetCategoryById;
import StepDefinition.Admin.Category.PUTUpdateCategory;
import StepDefinition.Admin.Category.PostCreateCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import StepDefinition.Admin.Category.GetAllCategory;
import net.thucydides.core.annotations.Steps;


public class Category {
    @Steps
    GetAllCategory getAllCategory;
    GetCategoryById getCategoryById = new GetCategoryById();;
    PostCreateCategory postCreateCategory = new PostCreateCategory();;
    PUTUpdateCategory putUpdateCategory = new PUTUpdateCategory();

    @Given("I set GET endpoints All Category")
    public void SetGETEndpointsAllCategory() {getAllCategory.SetGETEndpointsAllCategory();
    }

    @When("I send GET HTTP request All Category")
    public void SendGETHTTPRequestAllCategory() {getAllCategory.SendGETHTTPRequestAllCategory();
    }

    @Given("I set invalid GET endpoints All Category")
    public void SetInvalidGETEndpointsAllCategory() {getAllCategory.SetInvalidGETEndpointsAllCategory();
    }

    @When("I send invalid GET HTTP request All Category")
    public void SendInvalidGETHTTPRequestAllCategory() {getAllCategory.SendInvalidGETHTTPRequestAllCategory();
    }

    @When("I send invalid GET HTTP request All Category forbidden")
    public void SendInvalidGETHTTPRequestAllCategoryForbidden() {getAllCategory.SendInvalidGETHTTPRequestAllCategoryForbidden();
    }

    @Given("I set GET endpoints Category by Id")
    public void SetGETEndpointsCategoryById() {getCategoryById.SetGETEndpointsCategoryById();
    }

    @When("I send GET HTTP request Category by Id")
    public void SendGETHTTPRequestCategoryById() {getCategoryById.SendGETHTTPRequestCategoryById();
    }

    @Given("I set invalid GET endpoints Category by Id")
    public void SetInvalidGETEndpointsCategoryById() {getCategoryById.SetInvalidGETEndpointsCategoryById();
    }

    @When("I send invalid GET HTTP request Category by Id")
    public void SendInvalidGETHTTPRequestCategoryById() {getCategoryById.SendInvalidGETHTTPRequestCategoryById();
    }

    @When("I send invalid GET HTTP request Category by Id forbidden")
    public void SendInvalidGETHTTPRequestCategoryByIdForbidden() {getCategoryById.SendInvalidGETHTTPRequestCategoryByIdForbidden();
    }

    @Given("I set POST endpoints categories")
    public void SetPOSTEndpointsCategories() {postCreateCategory.setPostApiEndpointCategories();
    }

    @When("I send POST HTTP request categories")
    public void SendPOSTHTTPRequestCategories() {postCreateCategory.sendPostHttpRequestCategories();
    }

    @Given("I set PUT endpoints categories")
    public void iSetPUTEndpointsCategories() {putUpdateCategory.setPostApiEndpointUpdateCategory();
    }

    @When("I send PUT HTTP request categories")
    public void iSendPUTHTTPRequestCategories() {putUpdateCategory.sendPutHttpRequestUpdateCategory();
    }
}
