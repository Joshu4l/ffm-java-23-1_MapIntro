package school.maps;

/*
    Schritt 1: Baut eure Applikation aus dem ListIntro-Projekt von ArrayList in HashMap um.
 */

import java.util.ArrayList;
import java.util.List;

public class Student {

    // ATTRIBUTES
    protected String firstName;
    protected String lastName;
    protected String matriculationNumber;
    protected List<Course> courses = new ArrayList<>();
    //protected Map<Course> courses = new HashMap<>();


    // CONSTRUCTORS
    public Student () {
        // Default Constructor
    }
    public Student (String firstName, String lastName, String matriculationNumber) {
        // Custom Constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.matriculationNumber = matriculationNumber;
    }


    // OVERRIDE METHODS
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", matriculationNumber='" + matriculationNumber + '\'' +
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
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getMatriculationNumber () {
        return matriculationNumber;
    }
    public void setMatriculationNumber (String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    //TODO: public String enrollIntoCourseByCourseName
            // return student + " successfully enrolled into Course '" + course + "'."

    public String enrollIntoCourseByCourseName (String courseName) {
        //
        return "";

    }
}
