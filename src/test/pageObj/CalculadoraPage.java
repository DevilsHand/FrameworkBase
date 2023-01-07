package test.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.HashMap;

public class CalculadoraPage {
    private String url = "https://www.calculadoraonline.com.br/calculadora-virtual-gratis";
    private HashMap<String, WebElement> teclado;

    public CalculadoraPage(WebDriver driver){
        teclado = new HashMap<String, WebElement>();
        "1234567890"
                .chars()
                .forEach(num -> teclado
                        .put(String.valueOf(num),
                                driver.findElement(
                                        By.xpath("//div[contains(text(),'"+num+"')]")))
        );
    }
}
