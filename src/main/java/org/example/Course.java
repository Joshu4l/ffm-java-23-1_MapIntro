package org.example;

/*
    Schritt 1: Baut eure Applikation aus dem ListIntro-Projekt von ArrayList in HashMap um.
 */

public class Course {

    protected String courseName;
    protected String lecturer;
    protected String room;


    // CONSTRUCTORS
    public Course () {
        // Default Constructor
    }
    public Course (String courseName, String lecturer, String room) {
        // Custom Constructors
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.room = room;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", lecturer='" + lecturer + '\'' +
                ", room='" + room + '\'' +
                '}';
    }


    // GETTERS AND SETTERS
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLecturer() {
        return lecturer;
    }
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }


}
