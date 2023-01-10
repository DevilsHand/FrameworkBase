package test.pepino.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.core.web.annotation.FindBy;
import test.core.web.annotation.WebPageObj;
import test.core.web.pages.Page;

@WebPageObj(url="https://www.saucedemo.com/")
public class SplashPage extends Page {
    @FindBy(xPath = "//input[@id='user-name']")
    private WebElement userName;
    @FindBy(xPath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xPath = "//input[@id='login-button']")
    private WebElement loginBtn;

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}
