package de.neuefische.mavenIntro.model;

import java.util.Objects;

public class Student {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    private static int studentIds;

    private int studentId;
    private String studienrichtung = "";
    private int semester = 0;
    private String name = "";

    public Student(String name, String studienrichtung, int semester) {
        this.name = name;
        this.studienrichtung = studienrichtung;
        this.semester = semester;
        this.studentId = this.studentIds += 1;
    }

    public int getStudentId() {
        return studentId;
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

    public String createStudentInfo() {
        return this.name + " id(" + studentId + ")" + " studies " + this.studienrichtung + " in " + this.semester + ". semester";
    }


}
