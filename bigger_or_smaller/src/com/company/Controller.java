package com.company;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void initialize_model(Model model) {
        model.set_range(Constants.range_from, Constants.range_to);
        model.rand_initialise();
    }

    public void application_run(){
        Scanner uInput = new Scanner(System.in);
        int userInput = 0;
        int result = 0;
        initialize_model(model);
        boolean end_flag = true;
        view.message(View.GREETINGS);
        while(end_flag) {
            if (uInput.hasNextInt()) {
                userInput = uInput.nextInt();
                if ((userInput<model.get_min_value())||(userInput>model.get_max_value())) {
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
                        view.statistics(model.attempts, model.get_range(), model.previous_attempt);
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