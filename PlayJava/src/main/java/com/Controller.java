package com;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void initializeModel(Model model) {
        model.setRange(Constants.range_from, Constants.range_to);
        model.randInitialise();
    }

    public void applicationRun(){
        Scanner uInput = new Scanner(System.in);
        int userInput = 0;
        int result = 0;
        initializeModel(model);
        boolean end_flag = true;
        view.message(View.GREETINGS);
        while(end_flag) {
            if (uInput.hasNextInt()) {
                userInput = uInput.nextInt();
                if ((userInput<model.getMinValue())||(userInput>model.getMaxValue())) {
                    view.message(view.WRONG_INPUT);
                }
                else {
                    result=model.higher_lower(userInput);
                    if (result == 2) {
                        end_flag = false;
                        view.correctAnswer(model.attempts, model.previous_attempts);
                    }
                    else {
                        view.message(view.HIGHER_LOWER[result]);
                        view.statistics(model.attempts, model.getRange(), model.previous_attempt);
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
