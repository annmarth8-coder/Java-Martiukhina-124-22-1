package model;

import java.util.ArrayList;
import java.util.List;

// Клас групи студентів
public class Group extends UniversityUnit {

    private List<Student> students = new ArrayList<>(); // список студентів

    public Group(String name, Human head) {
        super(name, head);
    }

    // Додаємо студента
    public void addStudent(Student student) {
        students.add(student);
    }

    // Повертаємо список студентів
    public List<Student> getStudents() {
        return students;
    }
}
