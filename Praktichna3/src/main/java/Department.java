package model;

import java.util.ArrayList;
import java.util.List;

// Клас кафедри, містить групи
public class Department extends UniversityUnit {

    private List<Group> groups = new ArrayList<>(); // список груп

    public Department(String name, Human head) {
        super(name, head);
    }

    // Додаємо групу
    public void addGroup(Group group) {
        groups.add(group);
    }

    // Повертаємо список груп
    public List<Group> getGroups() {
        return groups;
    }
}
