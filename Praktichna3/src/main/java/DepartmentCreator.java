package controller;

import model.Department;
import model.Group;
import model.Human;

import java.util.List;

public class DepartmentCreator implements Creator<Department> {

    private String name;
    private Human head;
    private List<Group> groups;

    // Конструктор
    public DepartmentCreator(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups;
    }

    // Створюємо кафедру з групами
    @Override
    public Department create() {
        Department department = new Department(name, head);
        for (Group g : groups) {
            department.addGroup(g);
        }
        return department;
    }
}
