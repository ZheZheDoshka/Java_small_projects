package com.company;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void application_run(){

            System.out.println(System.getProperty("java.home"));
        Scanner uInput = new Scanner(System.in);
        int userInput = 0;
        int result = 0;
        model.rand_initialise();
        boolean end_flag = true;
        view.message(View.GREETINGS);
        while(end_flag) {
            if (uInput.hasNextInt()) {
                userInput = uInput.nextInt();
                if ((userInput<model.range[0])||(userInput>model.range[1])) {
                    view.message(view.WRONG_INPUT);
                    }
                else {
                    result=model.higher_lower(userInput);
                    if (result == 2) {
                        end_flag = false;
                        view.correct_answer(model.attempts, model.previous_attempts);
                    }
                    else {
                        view.message(view.HIGHER_LOWER[result]);
                        view.statistics(model.attempts, model.range, model.previous_attempt);
                    }
                }
            }
            else {
                view.message(view.WRONG_INPUT);
                uInput.next();
            }
        }

    }
}