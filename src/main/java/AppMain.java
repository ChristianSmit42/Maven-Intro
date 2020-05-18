public class AppMain {

    public static void main(String[] args) {
        Students[] students = new Students[4];

        students[0] = new Students("Max Müller", "Chemie", 2);
        students[1] = new Students("Moritz Meier", "Biologie", 4);
        students[2] = new Students("Mario Mauser", "Mathematik", 14);
        students[3] = new Students("Rudi Rakete", "Lehramt", 7);

        for (Students student : students) {
            student.printStudent();
        }
    }
}
