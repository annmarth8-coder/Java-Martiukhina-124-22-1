package model;

import java.util.ArrayList;
import java.util.List;

public class University extends UniversityUnit {

    private List<Faculty> faculties = new ArrayList<>(); // список факультетів

    public University(String name, Human head) {
        super(name, head);
    }

    // Додаємо факультет
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Повертаємо список факультетів
    public List<Faculty> getFaculties() {
        return faculties;
    }
}
