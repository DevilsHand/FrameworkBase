package test.pepino;

import test.core.web.annotation.ByXpath;
import test.core.web.pages.Page;

public class PageTeste extends Page {
    @ByXpath(xPath = "Xpath do Objeto")
    private String path;

    public String getPath() {
        return this.path ;
    }
}
