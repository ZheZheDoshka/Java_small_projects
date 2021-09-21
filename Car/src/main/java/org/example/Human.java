package org.example;

public class Human {
    private String name;
    private String gender;

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
