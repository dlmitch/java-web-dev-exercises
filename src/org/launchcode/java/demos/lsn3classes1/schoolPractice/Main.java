package org.launchcode.java.demos.lsn3classes1.schoolPractice;

import org.launchcode.java.demos.lsn3classes1.schoolPractice.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Student dave = new Student("Dave",1,4.0);
        Student deanna = new Student("Deanna M",37,4.0);
        Student john = new Student("John M",47,4.0);
        Student daryl = new Student("Daryl B",56,4.0);
        Teacher pearce = new Teacher("Pearce", "Odegard", "LC101", 3);
        ArrayList<Student> lc101Students = new ArrayList<>();
        lc101Students.add(dave);
        lc101Students.add(deanna);
        lc101Students.add(john);
        lc101Students.add(daryl);

        System.out.println(deanna.getName());

//        Dave --> Dave E Jones;
//        dave.setName("Dave E Jones");
//        dave.setNumberOfCredits(86);
//        System.out.println(dave.getName());
        System.out.println(deanna.toString());
        System.out.println(deanna.getGradeLevel());  //keep getting null
        Course launchCode101 = new Course(lc101Students, "LC101", pearce, 01);
        System.out.println(launchCode101);
    }
}
