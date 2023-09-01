package org.example;

/*
    Schritt 1: Baut eure Applikation aus dem ListIntro-Projekt von ArrayList in HashMap um.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

    protected String location;
    protected String schoolType;
    //protected List<Student> students = new ArrayList<>();
    protected Map<String, Student > students = new HashMap<>();


    // CONSTRUCTORS
    public School () {
        // Default Constructor
    }
    public School (String location, String schoolType) {
        // Custom Constructor
        this.location = location;
        this.schoolType = schoolType;
    }

    // OVERRIDE
    @Override
    public String toString() {
        return "School{" +
                "location='" + location + '\'' +
                ", schoolType='" + schoolType + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // GETTERS AND SETTERS
    public String getLocation () {
        return location;
    }
    public void setLocation (String location) {
        this.location = location;
    }

    public String getSchoolType () {
        return schoolType;
    }
    public void setSchoolType (String schoolType) {
        this.schoolType = schoolType;
    }


    public void addStudent(String matriculationNumber, Student student) {
        students.put(matriculationNumber, student);
    }

    public Student getStudentByMatriculationNumber (String matriculationNumber) {
        return students.get(matriculationNumber);
    }


    public String removeStudentByMatriculationNumber (String matriculationNumber) {
        students.remove(matriculationNumber);
        return "Student successfully removed.";

    }

    public void getAllStudents () {
        System.out.println(students);
    }


}
