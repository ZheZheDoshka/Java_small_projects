package com.company;

public class Model {
    public int searched_number;
    public int attempts = 0;
    public int previous_attempt;
    private int[] range = new int[2];
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

    public void set_range(int from,int to) {
        range[0] = from;
        range[1] = to;
    }

    public void rand_initialise(){
        searched_number = range[0]+1 + (int) (Math.random() * (range[1]-range[0]));
    }

    public int get_min_value() {
        return range[0];
    }

    public int get_max_value() {
        return range[1];
    }

    public int[] get_range() {
        return range;
    }
}
