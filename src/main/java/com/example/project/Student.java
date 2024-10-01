package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // instance variables for 
    private String fName;
    private String lName;
    private int gYear;
    private double testScores;
    private int tests;
    private double averageTestScore;
    private double highestTestScore;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        fName = firstName;
        lName = lastName;
        gYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        return fName;
    }
 
    // returns lastName
    public String getLastName() {
        return lName;
    }
 
    public double getHighestTestScore() {
        return highestTestScore;
    }

    public int getTestScoreCount(){
        return tests;
    }

    public int getGradYear(){
        //implement code here!
        return gYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        gYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        tests++;
        testScores += newTestScore;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        return averageTestScore()>=65;
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        averageTestScore = testScores/tests;
        return testScores/tests;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + fName + " " + lName);
        System.out.println("Graduation Year: " + gYear);
        System.out.println("Number of tests: " + tests);
        System.out.println("Average Test Score: " + averageTestScore);
        System.out.println("Highest Test Score: " + highestTestScore);
        System.out.println("Is passing: " + isPassing());
    }
 }
 