package org.example.Controller;
import org.example.View.View;

import java.util.Scanner;

public class RegexController {
    private View view;
    private Scanner inpt;

    public RegexController(View view, Scanner inpt){
        this.view = view;
        this.inpt = inpt;
    }

    public String RegexCheckInput(String message_type, String regex){
        view.printMessage(message_type);
        String str;
        str=inpt.nextLine();
        while (!str.matches(regex)) {
            view.printMessage(view.bd.getString("input.wrong.data"));
            view.printMessage(message_type);
            str = inpt.nextLine();
        }
        return str;
    }
}
