package test.pepino.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import test.pepino.logic.SplashLogic;

public class SplashSteps {
    private SplashLogic logic;
    public SplashSteps(){
        logic = new SplashLogic();
    }

    @Given("que estou na pagina de login")
    public void given(){
        logic.validarPage();
    }

    @When("Faco o login com os dados corretos")
    public void when(){
        logic.logarComUserCorreto();
    }

    @When("faco o login com user {string} e senha {string}")
    public void when(String user, String senha){
        logic.logarCom(user, senha);
    }

}
