package starter.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.choucair.SearchForC;
import starter.choucair.SearchResult;
import starter.choucair.navigation.NavigateCTo;


public class ValidEmployeesStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) esta en CHOUCAIR home page")
    public void valid1(String actor) {
    	System.out.println("*************************************");
    	System.out.println("*************************************");
    	System.out.println("*************************************");
    	System.out.println("*************************************");
    	System.out.println("*************************************");
    	System.out.println("VER::::::::::::::::: "+actor);
        theActorCalled(actor).attemptsTo(NavigateCTo.theChucairHomePage());
    }

    @When("^s?el usuario haga click en la seccion \"(.*)\"")
    public void click_for(String term) {
        theActorInTheSpotlight().attemptsTo( SearchForC.term(term) );
    }

    @Then("^existe la frase \"(.*)\"")
    public void all_the_result_titles_should_contain_the_word(String term) {
    	System.out.println("VER: "+SearchResult.titles());
        
    	theActorInTheSpotlight().should(
                seeThat("search result titles",
                        SearchResult.titles(), hasSize(greaterThan(0)))
        );
    }
}
