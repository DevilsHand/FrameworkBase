package test.pepino.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import test.core.web.enums.DriverTypeFactory;

public class Hooks {
    private static WebDriver driver;

    @Before
    public static void before() {
        System.out.println("Hooks inicando o driver");//TODO: Trocar p logger
        driver = DriverTypeFactory.getDriver(DriverTypeFactory.GECKO_DRIVER);
        //TODO: inicializar logger
    }
    public static WebDriver getDriver(){
        return driver;
    }//TODO: refatorar p dentro da driver fac

    @After
    public static void after() {
        System.out.println("Hooks encerrando o driver");
        driver.close();
    }
}
