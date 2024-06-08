package samplepackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeStepDef {

    @Given("I have credentials to login to webapp")
    public void given_step_def() {
        System.out.println();
    }

    @When("I open webapp")
    public void when_step_def() {
        System.out.println();
    }

    @And("I login using my credentials")
    public void and_step_def() {
        System.out.println();
    }

    @Then("I should be able to login")
    public void then_step_def() {
        System.out.println();
    }
}
