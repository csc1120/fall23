package wk11;

import java.util.Objects;

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Gio");
        s1.hashCode();
    }
    private int creditHours;
    private String name;
    private final int id;
    private static int numberOfStudents = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public Student(String name) {
        id = ++numberOfStudents;
        this.name = name;
    }
}
