package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.JoinToday;
import co.com.choucair.certification.utest.tasks.OpenUp;
import co.com.choucair.certification.utest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uteststepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Daniela wants to create an account on the Utest page$")
    public void danielaWantsToCreateAnAccountOnTheUtestPage() {
        OnStage.theActorCalled("Daniela").wasAbleTo(OpenUp.utestHomePage(), (JoinToday.onThePage()));
    }

    @When("^get into the Utest page and click on the (.*) button to register$")
    public void getIntoTheUtestPageAndClickOnTheJoinTodayButtonToRegister(String form) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onPage(form));
    }

    @Then("^she register the information for the successful (.*)$")
    public void sheRegisterTheInformationForTheSuccessfulCreationOfTheAccount(String question) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));


    }
}
