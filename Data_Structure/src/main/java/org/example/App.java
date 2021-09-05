package org.example;
import org.example.Model.Model;
import org.example.View.View;
import org.example.Controller.Controller;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Model model = new Model();
        View view = new View();
        Controller Reg_form = new Controller(model, view);
        Reg_form.applicationRun();
    }
}
