package com.example.project;

public class StudentRunner{
    public static void main(String[] args) {
        Student s = new Student("John", "Doe", 2025);
        s.addTestScore(91.5);
        s.addTestScore(95.6);
        s.printStudentInfo();
    }
}