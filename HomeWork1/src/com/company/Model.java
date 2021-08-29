package com.company;

public class Model {
    public static final String[] CORRECT_WORDS = {
            "Hello",
            "world!"
    };
    public static final int NUMBER_OF_WORDS = 2;
    public int cur_word = 0;
    public String futureOutput = "";

    public boolean checkInput (String str){
        if (str.equals(CORRECT_WORDS[cur_word])) {
            futureOutput+=(CORRECT_WORDS[cur_word]+" ");
            cur_word++;

            return true;
        }
        else {
            return false;
        }
    }

}
