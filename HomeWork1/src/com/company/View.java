package com.company;

public class View {

    public static final String[] WRONG_IN = {
            "wrong input! \"Hello\" expected",
            "wrong input! \"world!\" expected"
    };
    //public static final String WRONG_IN_DEFAULT = "wrong input!";
    public static final String GREETINGS = "Input \"Hello\" first, \"world!\" next";

    public void message(String message){
        System.out.println(message);
    }

}
