package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University extends UniversityUnit {
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, Student head) { super(name, head); }

    public void addFaculty(Faculty f) { faculties.add(f); }
    public List<Faculty> getFaculties() { return faculties; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        if (!super.equals(o)) return false;
        University that = (University) o;
        return Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), faculties); }

    @Override
    public String toString() {
        return super.toString() + " faculties=" + faculties;
    }
}
