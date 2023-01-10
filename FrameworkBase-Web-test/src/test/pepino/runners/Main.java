package test.pepino.runners;


import test.pepino.PageTeste;

public class Main {
    public static void main(String[] args) {
        String path = (new PageTeste()).getPath();
        System.out.println(path);
    }
}
