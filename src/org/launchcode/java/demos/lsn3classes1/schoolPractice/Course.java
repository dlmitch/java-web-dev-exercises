package org.launchcode.java.demos.lsn3classes1.schoolPractice;


import java.util.*;
public class Course {
    private ArrayList<Student> students;
    private String courseName = "Intro";
    private Teacher teacher;
    private int room;


    public Course(ArrayList<Student> students, String courseName, Teacher teacher, int room) {
        this.students = students;
        this.courseName = courseName;
        this.teacher = teacher;
        this.room = room;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> aStudents) {
        this.students = aStudents;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setName(String aCourseName) {
        this.courseName = aCourseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher aTeacher) {
        this.teacher = aTeacher;
    }

    public int getRoom() {
        return room;
    }
    public void setRoom(int aRoom) {
        this.room = aRoom;
    }

    @Override
    public String toString() {
        return "\nCourse\n" +
//                "Students: " + students.getName +
                "\nCourse Name: " + courseName + "\nTeacher: " + teacher.getFirstName() + " " + teacher.getLastName() +
                "\nRoom: " + room;
    }
}