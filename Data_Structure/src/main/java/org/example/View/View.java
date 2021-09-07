package org.example.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages"; //messages_en resource bundle WIP
    public static final ResourceBundle bd =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("ua", "UA"));              //for Ukrainian
                    new Locale("en"));           //for english

    public void printMessage(String message){
        System.out.println(message);
    }

}
