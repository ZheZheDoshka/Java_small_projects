package com.company;
import java.util.Scanner;

public class Model {
    public int searched_number;
    public int attempts = 0;
    public int previous_attempt = 0;
    public int[] range = {0, 100};
    public String previous_attempts = "";

    public int higher_lower(int number) {
        attempts++;
        if (number == searched_number){
            previous_attempts+=(previous_attempt+" ");
            return 2;
        }
        else if (number < searched_number) {
            range[0]=number;
            previous_attempts+=(previous_attempt+" ");
            previous_attempt = number;
            return 1;
        }
        else {
            range[1]=number;
            previous_attempts+=(previous_attempt+" ");
            previous_attempt = number;
            return 0;
        }
    }

    public void rand_initialise(){
        searched_number = range[0]+1 + (int) (Math.random() * (range[1]-range[0]-1));
    }
}
