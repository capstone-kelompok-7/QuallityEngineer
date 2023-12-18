package Steps.Admin;
import StepDefinition.Admin.Carousel.GetAllCarousel;
import StepDefinition.Admin.Carousel.GetCarouselById;
import StepDefinition.Admin.Carousel.PostCreateCarousel;
import StepDefinition.Admin.Carousel.PutUpdateCarousel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import StepDefinition.Admin.Category.GetAllCategory;
import net.thucydides.core.annotations.Steps;

public class Carousel {
    @Steps
    GetAllCarousel getAllCarousel;
    GetCarouselById getCarouselById = new GetCarouselById();
    PostCreateCarousel postCreateCarousel = new PostCreateCarousel();
    PutUpdateCarousel putUpdateCarousel = new PutUpdateCarousel();


    @Given("I set GET endpoints All Carousel")
    public void SetGETEndpointsAllCarousel() {getAllCarousel.SetGETEndpointsAllCarousel();
    }

    @When("I send GET HTTP request All Carousel")
    public void SendGETHTTPRequestAllCarousel() {getAllCarousel.SendGETHTTPRequestAllCarousel();
    }

    @Given("I set invalid GET endpoints All Carousel")
    public void iSetInvalidGETEndpointsAllCarousel() {getAllCarousel.SetInvalidGETEndpointsAllCategory();
    }

    @When("I send invalid GET HTTP request All Carousel")
    public void iSendInvalidGETHTTPRequestAllCarousel() {getAllCarousel.SendInvalidGETHTTPRequestAllCategory();
    }

    @When("I send invalid GET HTTP request All Carousel forbidden")
    public void iSendInvalidGETHTTPRequestAllCarouselForbidden() {getAllCarousel.SendInvalidGETHTTPRequestAllCarouselForbidden();
    }

    @Given("I set GET endpoints Carousel by Id")
    public void iSetGETEndpointsCarouselById() {getCarouselById.SetGETEndpointsCarouselById();
    }

    @When("I send GET HTTP request Carousel by Id")
    public void iSendGETHTTPRequestCarouselById() {getCarouselById.SendGETHTTPRequestCarouselById();
    }

    @Given("I set invalid GET endpoints Carousel by Id")
    public void iSetInvalidGETEndpointsCarouselById() {getCarouselById.SetInvalidGETEndpointsCarouselById();
    }

    @When("I send invalid GET HTTP request Carousel by Id")
    public void iSendInvalidGETHTTPRequestCarouselById() {getCarouselById.SendInvalidGETHTTPRequestCarouselById();
    }

    @Given("I set POST endpoints Carousel")
    public void iSetPOSTEndpointsCarousel() {postCreateCarousel.setPostApiEndpointCreateCarousel();
    }

    @When("I send POST HTTP request Carousel")
    public void iSendPOSTHTTPRequestCarousel() {postCreateCarousel.sendPostHttpRequestCreateCarousel();
    }

    @Given("I set PUT endpoints Carousel")
    public void iSetPUTEndpointsCarousel() {putUpdateCarousel.setPostApiEndpointUpdateCarousel();
    }

    @When("I send PUT HTTP request Carousel")
    public void iSendPUTHTTPRequestCarousel() {putUpdateCarousel.sendPutHttpRequestUpdateCarousel();
    }
}
