package test.core;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import test.core.logger.LogWritter;
import test.core.web.enums.DriverTypeFactory;

public abstract class Context {
    private static WebDriver driver;
    private static Logger logger;
    public static void init() {
        //TODO: selecionar ambiente automarticamente ou via Annotation
        driver = DriverTypeFactory.getDriver(DriverTypeFactory.GECKO_DRIVER);
        logger = LogWritter.getLogger();
    }
    public static void end() {

    }
    //TODO: adicionar logger automatico
    public static Logger getLogger(){ return logger; }

    public static WebDriver getDriver(){ return driver; }
}
