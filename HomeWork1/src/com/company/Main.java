package com.company;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller HelloWorld = new Controller(model, view);
        HelloWorld.application_run();
    }
}
