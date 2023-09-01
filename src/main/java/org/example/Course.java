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
