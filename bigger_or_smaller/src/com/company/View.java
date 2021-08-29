package com.company;

public class View {
    public static final String MESSAGE_PREV_ATTEMPT = "Previous attempt: ";
    public static final String MESSAGE_ALL_ATTEMPTS = "Previous attempts: ";
    public static final String MESSAGE_ATTEMPTS = "Number of attempts: ";
    public static final String GREETINGS = "Hi. Guess number between 0 and 100";
    public static final String WRONG_INPUT = "Wrong input! Integer number in range expected";
    public static final String CORRECT_ANSWER = "Congratulations!";
    public static final String[] HIGHER_LOWER = {
            "NUMBER IS LOWER THAN YOURS",
            "NUMBER IS HIGHER THAN YOURS",
            "CORRECT NUMBER. WELL DONE"
    };
    public static final String RANGE = "Range: [";

    public void message(String message){
        System.out.println(message);
    }

    public void statistics(int attempt_num, int[] range, int previous){
        message(MESSAGE_PREV_ATTEMPT + previous);
        message(MESSAGE_ATTEMPTS + attempt_num);
        message(RANGE+ range[0] + "," + range[1] + "]");
    }

    public void correct_answer(int attempt_num, String attempts){
        message(CORRECT_ANSWER);
        message(MESSAGE_ATTEMPTS + attempt_num);
        message(MESSAGE_ALL_ATTEMPTS + attempts.substring(2, attempts.length()));
    }
}
