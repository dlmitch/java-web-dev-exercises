package org.launchcode.java.demos.lsn3classes1.schoolPractice;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }

    @Override
    public String toString() {
        return "\nTeacher\n" +
                "First Name: " + firstName + "\nLast Name: " + lastName + "\nSubject: " + subject + "\nYears Teaching: " + yearsTeaching;
    }
}