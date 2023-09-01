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

public class Main {

    public static void main(String[] args) {

        // Prepare an ArrayListe for multiple Student Objects
        List<Student> students = new ArrayList<>();

        // Instantiate multiple Students
        Student student1 = new Student("Ulrike", "Werner", "M-12");
        Student student2 = new Student("Marc", "Veizhans", "M-34");
        Student student3 = new Student("Frank", "Fleischer", "M-45");
        Student student4 = new Student("Josh", "Albert", "M-67");
        // Add some Student instances to the students ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        // Print the current list of students:
        System.out.println("\nThe following students have been instantiated:");
        for (Student element: students) {
            System.out.println(element);
        }


        // Instantiate a School instance
        School school1 = new School("Hamburg", "Bootcamp");
        // Print the school
        System.out.println("\nCredentials of the school you instantiated:");
        System.out.println(school1);
        // Matriculate some students
        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);
        school1.addStudent(student4);
        // Show all of the school's enrolled students
        System.out.println("\nStudents matriculated at the school:");
        school1.getAllStudents();
        // Search a specific student
        System.out.println("\nMatching results for your student-search:");
        System.out.println(school1.getStudentByMatriculationNumber("M-12"));
        // Remove a specific student
        System.out.println("\n");
        System.out.println(school1.removeStudentByMatriculationNumber("M-67"));


        // Instantiate 2 Course instances
        Course webDev = new Course("Web Development", "Peter Anderson", "ffm-webDevelopment-23-01");
        Course javaDev = new Course("Java Development", "Daniel Schwarz", "ffm-java-23-1");

        // TODO: enroll a student into both courses

        // TODO: Show all of the student's courses he/she is enrolled into



    }
}
