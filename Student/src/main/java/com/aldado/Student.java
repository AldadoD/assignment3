package com.aldado;

public class Student extends Person {
        private String major;
        private Double gpa;

    public Student(String fName, String lName, String major,Double gpa){
            super(fName, lName);
            this.major = major;
            this.gpa = gpa;
        }


    public String getMajor() {
        return major;
    }

    public Double getGpa() {
        return gpa;
    }
}
