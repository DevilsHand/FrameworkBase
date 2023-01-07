package test.pepino.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static test.pepino.hooks.Hooks.getDriver;

public class StepsTest {

    @Given("dado que")
    public void dadoQue() {
        System.out.println("Acessando google");
        getDriver().get("https://www.google.com");
    }
    @When("quando")
    public void quando() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Google acessado");
    }
    @Then("entao")
    public void entao() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then, após isso o After deve encerrar o Browser");
    }

    @Given("dado que dois")
    public void dadoQueDois() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Acessando Bing");
        getDriver().get("https://www.bing.com");
    }
    @When("quando dois")
    public void quandoDois() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Bing acessado");
    }
    @Then("entao dois")
    public void entaoDois() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Após isso o After deve encerrar novamente o navegador");
    }

}
