//package test.classes;
//
//
//import test.SimulatedWait;
//import test.core.Hooks;
//import test.core.logger.LogWritter;
//
//public class TestesDeExemplo extends Hooks {
//
//
//    @Test(testName = "Teste Exemplo 1")
//    public void testeDeExemplo(){
//        LogWritter.logFieldValidation("Campo de teste 1");
//        Assert.assertEquals("isso é verdade", "isso é verdade");
//        SimulatedWait.waitSecs(1);
//        LogWritter.logFieldValidation("Campo de teste 2", "isso também é verdade");
//        Assert.assertEquals("isso também é verdade", "isso também é verdade");
//        SimulatedWait.waitSecs(2);
//    }
//
//    @Test(testName = "Teste Exemplo 2")
//    public void testeDeExemplo2(){
//        LogWritter.logFieldValidation("Campo 3", "isso não é verdade");
//        Assert.assertEquals("isso nao eh verdade", "isso não é verdade");
//    }
//}
