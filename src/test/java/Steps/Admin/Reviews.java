package Steps.Admin;

import StepDefinition.Admin.Reviews.GetAllReviews;
import StepDefinition.Admin.Reviews.GetReviewsById;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Reviews {
    @Steps
    GetAllReviews getAllReviews;
    GetReviewsById getReviewsById = new GetReviewsById();

    @Given("I set GET endpoints All Reviews")
    public void setGetEndpointsAllReviews(){getAllReviews.SetGETEndpointsAllReviews();
    }

    @When("I send GET HTTP request All Reviews")
    public void iSendGETHTTPRequestAllReviews() {getAllReviews.SendGETHTTPRequestAllReviews();
    }

    @Given("I set invalid GET endpoints All Reviews")
    public void iSetInvalidGETEndpointsAllReviews() {getAllReviews.SetInvalidGETEndpointsAllReviews();
    }

    @When("I send invalid GET HTTP request All Reviews")
    public void iSendInvalidGETHTTPRequestAllReviews() {getAllReviews.SendInvalidGETHTTPRequestAllReviews();
    }

    @When("I send invalid GET HTTP request All Product forbidden")
    public void iSendInvalidGETHTTPRequestAllProductForbidden() {getAllReviews.SendInvalidGETHTTPRequestAllReviewsForbidden();
    }

    @Given("I set GET endpoints Reviews by Id")
    public void iSetGETEndpointsReviewsById() {getReviewsById.SetGETEndpointsReviewsById();
    }

    @When("I send GET HTTP request Reviews by Id")
    public void iSendGETHTTPRequestReviewsById() {getReviewsById.SendGETHTTPRequestReviewsById();
    }

    @Given("I set invalid GET endpoints Reviews by Id")
    public void iSetInvalidGETEndpointsReviewsById() {getReviewsById.SetInvalidGETEndpointsReviewsById();
    }

    @When("I send invalid GET HTTP request Reviews by Id")
    public void iSendInvalidGETHTTPRequestReviewsById() {getReviewsById.SendInvalidGETHTTPRequestReviewsById();
    }

    @When("I send invalid GET HTTP request Reviews by Id forbidden")
    public void iSendInvalidGETHTTPRequestReviewsByIdForbidden() {getReviewsById.SendInvalidGETHTTPRequestReviewsByIdForbidden();
    }
}
