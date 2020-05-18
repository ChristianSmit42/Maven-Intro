package de.neuefische.mavenIntro.utils;

public class Calculations {

    public static int add(int a, int b) {
        return a + b;
    }

    public static String coronaCount(int a) {
        if (a <= 30) {
            return "OK";
        }
        return "LIMIT ÜBERSCHRITTEN!";
    }

    public static int countByAlert(String a) {
        switch (a) {
            case "gruen":
                return 60;
            case "gelb":
                return 30;
            case "rot":
                return 0;
            default:
                return 0;
        }
    }

    public static int fclty(int n) {
        assert n >= 0;
        int faculty = 1;

//          Lösung mit FOR

       /* for(int i=2;i<=n;i++){
            faculty *= i;
        }
        return faculty;*/

//          Lösung mit WHILE

        /*int i = 1;
        while (i <= n) {
            faculty *= n;
            n--;
        }
        return faculty;*/


//        Lösung mit REKURSION

        if (n <= 1) {
            return faculty;
        } else {
            return fclty(n - 1) * n;
        }

    }

    public String[] studentsCreation(int amount) {
        String[] students = new String[amount];
        for (int i = 0; i < amount; i++) {
            students[i] = "Student Nr. " + (i + 1);
        }
        return students;
    }
    public void printStudents(int amount){
        String[] stud = studentsCreation(amount);
        for (String s : stud) {
            System.out.println(s);
        }
    }
}
