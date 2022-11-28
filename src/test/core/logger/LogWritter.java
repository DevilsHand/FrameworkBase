package test.core.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LogWritter implements Logger {
    private static final Logger logger = LoggerFactory.getLogger(LogWritter.class);
    public static Logger getLogger(){
        return logger;
    }

    public static void logFieldValidation(String fieldName){
        logger.info("Validando se o campo <" + fieldName + "> tem o valor correto");
    }
    public static void logFieldValidation(String fieldName, String expectedValue){
        logger.info("Validando se o campo <" + fieldName + "> tem o valor <" + expectedValue + ">");
    }
}
