package tramo.steps;


import io.cucumber.java.en.*;
import tramo.pages.LogInPages;

public class LogInTramoSteps extends LogInPages {


    @Given("^I am on the Tramo home page$")
    public void iAmOnTheTramoHomePage() {
        navigateToUrl();
    }

    @When("Enter your credencials {} and {}")
    public void enterYourCredencialsAnd(String user, String password) {
        enterCredentials(user, password);
    }

    @And("^cick on the button Login$")
    public void cickOnTheButtonLogin() {
        clickLogInButton();
    }

    @Then("^check log in$")
    public void checkLogIn() {
        checkDashboard();
    }



}
