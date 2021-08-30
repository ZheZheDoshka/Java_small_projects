package com;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller more_less = new Controller(model, view);

        more_less.applicationRun();
    }
}