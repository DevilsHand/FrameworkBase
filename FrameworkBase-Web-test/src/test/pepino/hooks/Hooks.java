package test.pepino.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import test.core.Context;


public class Hooks {

    @Before
    public static void before() {
        Context.init();
    }
    @After
    public static void after() {
        Context.end();
    }
}
