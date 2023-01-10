package test.pepino.logic;

import org.testng.Assert;
import test.pepino.pages.MainPage;

public class MainPageLogic {
    private MainPage page;
    public MainPageLogic(){
        page = new MainPage();
    }

    public void validarAcessoPagina() {
        Assert.assertEquals(page.getTitle().getText(),
        "PRODUCTS",
                "Página incorreta");
    }
}
