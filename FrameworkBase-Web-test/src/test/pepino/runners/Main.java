package test.pepino.runners;

import test.core.Context;
import test.pepino.logic.SplashLogic;


public class Main {
    public static void main(String[] args) {
        Context.init();
        var logic = new SplashLogic();
        logic.logarComUserCorreto();
    }
}
