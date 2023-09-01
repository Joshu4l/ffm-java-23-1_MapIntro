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

public class School {

    protected String location;
    protected String schoolType;
    protected List<Student> students = new ArrayList<>();


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

    public void addStudent (Student student) {
        students.add(student);
    }

    public Student getStudentByMatriculationNumber (String matriculationNumber) {
        for (Student student: students) {
            if (student.matriculationNumber.equalsIgnoreCase(matriculationNumber)) {
                return student;
            } else {
                continue;
            }
        } return null;
    }

    public String removeStudentByMatriculationNumber (String matriculationNumber) {

        Student studentToRemove = null;
        for (Student student : students) {
            if (student.matriculationNumber.equalsIgnoreCase(matriculationNumber)) {
                studentToRemove = student;
                break; // Das gesuchte Element wurde gefunden, die Schleife kann beendet werden.
            }
        }
        if (studentToRemove != null && students.remove(studentToRemove)) {
            return "Student " + studentToRemove + " successfully removed.";
        } else {
            return "Student with matriculationNumber " + matriculationNumber + " could not be found.";
        }
    }

    public void getAllStudents () {
        for (Student student: students) {
            System.out.println(student);
        }
    }

}
