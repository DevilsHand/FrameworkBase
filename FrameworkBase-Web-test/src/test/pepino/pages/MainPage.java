package test.pepino.pages;

import org.openqa.selenium.WebElement;
import test.core.web.annotation.FindBy;
import test.core.web.annotation.WebPageObj;
import test.core.web.pages.Page;

@WebPageObj(url = "https://www.saucedemo.com/inventory.html")
public class MainPage extends Page {

    @FindBy(xPath = "//span[@class='title']")
    private WebElement title;

    public WebElement getTitle() {
        return title;
    }
}
