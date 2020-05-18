package de.neuefische.mavenIntro.model;

public class Student {

    private String studienrichtung = "";
    private int semester = 0;
    private String name = "";

    public Student(String name, String studienrichtung, int semester) {
        this.name = name;
        this.studienrichtung = studienrichtung;
        this.semester = semester;
    }

    public String getStudienrichtung() {
        return studienrichtung;
    }

    public void setStudienrichtung(String studienrichtung) {
        this.studienrichtung = studienrichtung;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStudent() {
        System.out.println(this.name + " studies " + this.studienrichtung + " in " + this.semester + ". semester");
    }

    public String createStudentInfo(){
        return this.name + " studies " + this.studienrichtung + " in " + this.semester + ". semester";
    }


}
