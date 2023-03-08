package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TP6AutomationTestingHomeService;
import lippia.web.services.TP6AutomationTestingMyAccountService;
import lippia.web.services.GoogleSearchResultService;

public class TP6LoginSteps extends PageSteps {

    @Given("The client is in automation testing page")
    public void home() {
        TP6AutomationTestingHomeService.navegarWeb();
    }

    @When("^The client log in with the user (.*) and the password (.*)$")
    public void search(String criteria, String criteria2) {
        TP6AutomationTestingHomeService.clickMyAccountButton();
        TP6AutomationTestingMyAccountService.sendUser(criteria);
        TP6AutomationTestingMyAccountService.sendPassword(criteria2);
        TP6AutomationTestingMyAccountService.clickLogInButton();
    }

    @Then("User is logged in")
    public void logInVerification() {
        TP6AutomationTestingMyAccountService.isloggedIn();
    }

    @Then("it does not enter")
    public void notLogInVerification() {
        TP6AutomationTestingMyAccountService.isNotloggedIn();
    }

    @Then("The error message user name not registered appears")
    public void messageUserNameNotRegisteredAppears() {
        TP6AutomationTestingMyAccountService.messageUserNameNotRegisteredAppears();

    }

    @Then("Password required error message appears")
    public void messagePasswordRequiredAppears() {
        TP6AutomationTestingMyAccountService.messagePasswordRequiredAppears();
    }

}
