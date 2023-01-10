package test.pepino.logic;

import test.pepino.pages.SplashPage;

public class SplashLogic {
    private SplashPage page;
    public SplashLogic(){
        page = new SplashPage();
    }

    public void logarComUserCorreto() {
        page.getUserName().sendKeys("standard_user");
        page.getPassword().sendKeys("secret_sauce");
        page.getLoginBtn().click();
    }
    public void logarCom(String user, String pass){
        page.getUserName().sendKeys(user);
        page.getPassword().sendKeys(pass);
        page.getLoginBtn().click();
    }
}
