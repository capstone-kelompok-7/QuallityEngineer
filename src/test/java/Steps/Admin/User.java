package Steps.Admin;

import StepDefinition.Admin.User.DelUser;
import StepDefinition.Admin.User.GetActivities;
import StepDefinition.Admin.User.GetAllUser;
import StepDefinition.Admin.User.GetUserById;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class User {
    @Steps
    GetAllUser getAllUser;
    GetUserById getUserById = new GetUserById();
    GetActivities getActivities = new GetActivities();
    DelUser delUser = new DelUser();

    @Given("I set GET endpoints All User")
    public void setGetEndpointsAllReviews(){getAllUser.SetGETEndpointsAllUser();
    }

    @When("I send GET HTTP request All User")
    public void iSendGETHTTPRequestAllUser() {getAllUser.SendGETHTTPRequestAllUsers();
    }

    @Given("I set invalid GET endpoints All User")
    public void iSetInvalidGETEndpointsAllUser() {getAllUser.SetInvalidGETEndpointsAllUser();
    }

    @When("I send invalid GET HTTP request All User")
    public void iSendInvalidGETHTTPRequestAllUser() {getAllUser.SendInvalidGETHTTPRequestAllUser();
    }

    @When("I send invalid GET HTTP request All User forbidden")
    public void iSendInvalidGETHTTPRequestAllUserForbidden() {getAllUser.SendInvalidGETHTTPRequestAllUserForbidden();
    }

    @Given("I set GET endpoints User by Id")
    public void iSetGETEndpointsUserById() {getUserById.SetGETEndpointsUserById();
    }

    @When("I send GET HTTP request User by Id")
    public void iSendGETHTTPRequestUserById() {getUserById.SendGETHTTPRequestUserById();
    }

    @When("I send invalid GET HTTP request User by Id forbidden")
    public void iSendInvalidGETHTTPRequestUserByIdForbidden() {getUserById.SendInvalidGETHTTPRequestUserByIdForbidden();
    }

    @Given("I set GET endpoints Activity by Id")
    public void iSetGETEndpointsActivityById() {getActivities.SetGETEndpointsActivities();
    }

    @When("I send GET HTTP request Activity by Id")
    public void iSendGETHTTPRequestActivityById() {getActivities.SendGETHTTPRequestActivities();
    }

    @When("I send invalid GET HTTP request Activity by Id forbidden")
    public void iSendInvalidGETHTTPRequestActivityByIdForbidden() {getActivities.SendInvalidGETHTTPRequestActivitiesForbidden();
    }

    @Given("I set DELETE endpoints delete User")
    public void iSetDELETEEndpointsDeleteUser() {delUser.setDeleteEndpointUser();
    }

    @When("I send DELETE HTTP request delete User")
    public void iSendDELETEHTTPRequestDeleteUser() {delUser.sendDeleteHttpRequestDeleteUser();
    }
}
