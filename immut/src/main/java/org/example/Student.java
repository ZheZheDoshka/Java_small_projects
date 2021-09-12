package org.example;

public class Student {
    private String name;
    private int age;
    private String group;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //self check
            return true;
        }
        if (obj == null) { //null check
            return false;
        }
        if (getClass() != obj.getClass()){ //type
            return false;
        }
        Student stud = (Student) obj;
        if (this.getAge() != stud.getAge()) {
            return false;
        }
        if (!this.getName().equals(stud.getName())) {
            return false;
        }
        return !this.getGroup().equals(stud.getGroup());
    }

    @Override
    public int hashCode() {
        int hash = 1;
        int i;
        int prime_num = 31; //there are many odd prime numbers, but this looks like a tradition
        hash = hash*prime_num+age;
        for (i = 0; i<name.length(); i++){
            hash = hash*31 + name.charAt(i);
        }
        for (i = 0; i<group.length(); i++){
            hash = hash*31 + group.charAt(i);
        }
        return hash;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

