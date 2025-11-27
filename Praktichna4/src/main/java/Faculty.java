package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UniversityUnit {
    private List<Department> departments = new ArrayList<>();

    public Faculty(String name, Student head) { super(name, head); }

    public void addDepartment(Department d) { departments.add(d); }
    public List<Department> getDepartments() { return departments; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), departments); }

    @Override
    public String toString() {
        return super.toString() + " departments=" + departments;
    }
}
