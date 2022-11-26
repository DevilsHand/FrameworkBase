package classes;

import core.Hooks;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestesDeExemplo extends Hooks {

    @Test(testName = "Teste Exemplo 1")
    public void testeDeExemplo(){
        Assert.assertEquals("isso é  verdade", "isso é verdade");
        Assert.assertEquals("isso também é verdade", "isso também é  verdade");
    }

    @Test(testName = "Teste Exemplo 2")
    public void testeDeExemplo2(){
        Assert.assertEquals("isso é verdade", "isso nao é verdade");
    }
}
