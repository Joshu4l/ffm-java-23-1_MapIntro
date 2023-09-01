package school.maps;

/*
    Schritt 1: Baut eure Applikation aus dem ListIntro-Projekt von ArrayList in HashMap um.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Prepare an ArrayListe for multiple Student Objects
        List<Student> students = new ArrayList<>();

        // Instantiate multiple Students
        Student student1 = new Student("Rylie", "Castell", "M-12");
        Student student2 = new Student("Leonie", "Tschapalda", "M-34");
        Student student3 = new Student("Dennis", "Fank", "M-45");
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
        school1.addStudent(student1.matriculationNumber, student1);
        school1.addStudent(student2.matriculationNumber, student2);
        school1.addStudent(student3.matriculationNumber, student3);
        school1.addStudent(student4.matriculationNumber, student4);
        // Show all of the school's enrolled students
        System.out.println("\nStudents matriculated at the school:");
        school1.getAllStudents();
        // Search a specific student
        System.out.println("\nMatching results for your student-search:");
        System.out.println(school1.getStudentByMatriculationNumber("M-12"));
        // Remove a specific student
        System.out.println("\n");
        System.out.println(school1.removeStudentByMatriculationNumber("M-67"));
        // Print the resulting student map again after M-67 has been removed
        System.out.println("\nStudents matriculated at the school (after removing M-67):");
        System.out.println(school1.students);


        // Instantiate 2 Course instances
        Course webDev = new Course("Web Development", "Peter Anderson", "ffm-webDevelopment-23-01");
        Course javaDev = new Course("Java Development", "Daniel Schwarz", "ffm-java-23-1");

        // TODO: enroll a student into both courses
        // TODO: Show all of the student's courses he/she is enrolled into

    }
}
