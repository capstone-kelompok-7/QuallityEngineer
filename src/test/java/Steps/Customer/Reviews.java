package Steps.Customer;

import StepDefinition.Customer.Reviews.PostCreateReviews;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Reviews {
    @Steps
    PostCreateReviews postCreateReviews;

    @Given("I set POST endpoints Reviews")
    public void SetPOSTndpointsReviews() {postCreateReviews.setPostApiEndpointReviews();
    }

    @When("I send POST HTTP request Reviews")
    public void iSendPOSTHTTPRequestReviews() {postCreateReviews.sendPostHttpRequestReviews();
    }

    @Given("I set invalid POST endpoints Reviews")
    public void iSetInvalidPOSTEndpointsReviews() {postCreateReviews.setPostApiInvalidEndpointReviews();
    }

    @When("I send invalid POST HTTP request Reviews")
    public void iSendInvalidPOSTHTTPRequestReviews() {postCreateReviews.sendInvalidPostHttpRequestReviews();
    }
}
