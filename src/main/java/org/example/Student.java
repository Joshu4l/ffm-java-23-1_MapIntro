package org.example;

/* Erstellt ein neues Projekt in IntelliJ und legt damit den Grundstein für das Java-List Projekt.

   Schritt 1: Lege eine Java-Klasse "Student" an, die folgende Eigenschaften haben soll:
   Vorname, Nachname, Matrikelnummer.

   Schritt 2: Erstelle eine Java List für Elemente des Typs "Student"
   und füge mehrere Studenten hinzu.

   Schritt 3: Lege eine Klasse "School" an, zu der man
   Students über eine Methode ('addStudent') hinzufügen kann.

   Schritt 4: Implementiere eine Methode, um alle Students der Schule auszugeben
   (als Text, auf die Console).

   Schritt 5: Füge eine Methode hinzu, um einen Student anhand der id zu finden.
   Der/Die gefundene Student:in soll returned werden.

   Schritt 6: Erstelle eine Methode, um eine*n Student aus der Schule zu entfernen.
*/


/* Bonus Aufgabe

   Erweitere dein Projekt um eine Klasse 'Course', die folgende Eigenschaften hat:
   Kursname, Dozent, Raum

   Füge der Student-Klasse eine Methode hinzu, mit der man Kurse zu einer/m Student:in
   hinzufügt (an denen der/die Student:in teilnimmt).
 */

import java.util.ArrayList;
import java.util.List;

public class Student {

    // ATTRIBUTES
    protected String firstName;
    protected String lastName;
    protected String matriculationNumber;
    protected List<Course> courses = new ArrayList<>();


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
