package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group extends UniversityUnit {
    private List<Student> students = new ArrayList<>();

    public Group(String name, Student head) { super(name, head); }

    public void addStudent(Student student) { students.add(student); }
    public List<Student> getStudents() { return students; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        if (!super.equals(o)) return false;
        Group group = (Group) o;
        return Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), students); }

    @Override
    public String toString() {
        return super.toString() + " students=" + students;
    }
}
