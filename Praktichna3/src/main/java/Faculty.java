
package model;

import java.util.ArrayList;
import java.util.List;

// Клас факультету, містить кафедри
public class Faculty extends UniversityUnit {

    private List<Department> departments = new ArrayList<>(); // список кафедр

    public Faculty(String name, Human head) {
        super(name, head);
    }

    // Додаємо кафедру
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Повертаємо список кафедр
    public List<Department> getDepartments() {
        return departments;
    }
}
