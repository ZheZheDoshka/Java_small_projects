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
        Scanner uInput = new Scanner(System.in);
        String userInput;
        view.message(View.GREETINGS);
        while(model.cur_word < Model.NUMBER_OF_WORDS) {
            userInput = uInput.nextLine();
            if (!model.checkInput(userInput)){
                view.message(View.WRONG_IN[model.cur_word]);
            }
        }
        view.message(model.futureOutput);
    }
}
