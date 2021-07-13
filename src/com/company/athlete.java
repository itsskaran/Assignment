package com.company;

public class athlete {
    String firstname, lastname;
    int id;
    Integer score[];
    float average = 0;
    //constructor
    public athlete(String firstname, String lastName, int id, Integer[] score) {
        this.firstname = firstname;
        this.lastname = lastName;
        this.id = id;
        this.score = new Integer[score.length];
        this.score = score;
    }
    //method to calculate average
    public void calc_average() {
        for (int i = 0; i < score.length; i++) {
            average += score[i];
        }
        average /= score.length;
    }
    //method to display
    public void display() {
        System.out.println(firstname + " " + lastname + "\t" + average);
    }
}

