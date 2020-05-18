package de.neuefische.mavenIntro;
import de.neuefische.mavenIntro.model.Student;

public class AppMain {

    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Max Müller", "Chemie", 2);
        students[1] = new Student("Moritz Meier", "Biologie", 4);
        students[2] = new Student("Mario Mauser", "Mathematik", 14);
        students[3] = new Student("Rudi Rakete", "Lehramt", 7);

        for (Student student : students) {
            //student.printStudent();
            System.out.println(student.createStudentInfo());
        }
    }
}
