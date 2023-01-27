package org.launchcode.java.demos.lsn3classes1.schoolPractice;
import java.util.*;
// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student<numberOfCredits> {
    private static int nextStudentId = 1;
    private String name;
    private int studentID;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private String gradeLevel;
//    this.gradeLevel = student.getGradeLevel(student.numberOfCredits)

    public Student () {
        this.studentID = nextStudentId;
        nextStudentId++;
    }
    public Student(String name, int numberOfCredits, double gpa) {
        this();
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentID() {
        return this.studentID;
    }
    public void setStudentID(int aStudentID) {
        this.studentID = aStudentID;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = getGradeLevel(numberOfCredits);
    }

    public double getGpa() {
        return this.gpa;
    }
    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

//    public Student(String name, int studentID) {
//        this(name, studentID);
//    }
//
//    public Student(String name) {
//        this(name, nextStudentId);
//        nextStudentId++;
//    }

    @Override
    public String toString() {
        return "\nStudent\n" +
                "Name: " + name +
                "\nStudent ID: " + studentID +
                "\nNumber Of Credits: "  + numberOfCredits +
//                "\nGrade Level: " + gradeLevel +
                "\nGPA: " + gpa;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
    }

    public String getGradeLevel(int numberOfCredits) {
        // Determine the grade level of the student based on numberOfCredits
        if(numberOfCredits<=29){
            return "freshman";
        } else if(numberOfCredits<=59){
            return "sophomore";
        } else if(numberOfCredits<=89){
            return "junior";
        } else {
            return "senior";
        }
    }
//  just gives me null when i try to apply it to a student

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentID() == student.getStudentID();
    }


}