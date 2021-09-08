package org.example.Model;

public class Model {
    public String FIO(String name, String surname, String paronym){
        String fio;
        fio = name.substring(0,1) + ". " + paronym.substring(0,1) + ". " + surname;
        return fio;
    }
}
