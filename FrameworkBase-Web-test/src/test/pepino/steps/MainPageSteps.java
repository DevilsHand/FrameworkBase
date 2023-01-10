package test.pepino.steps;

import io.cucumber.java.en.Then;
import test.pepino.logic.MainPageLogic;

public class MainPageSteps {
    private MainPageLogic logic;
    public MainPageSteps(){
        logic = new MainPageLogic();
    }

    @Then("confirmo o acesso a pagina principal")
    public void then(){
     logic.validarAcessoPagina();
    }
}
