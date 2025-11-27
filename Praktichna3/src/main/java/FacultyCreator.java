package controller;

import model.Faculty;
import model.Department;
import model.Human;

import java.util.List;

public class FacultyCreator implements Creator<Faculty> {

    private String name;
    private Human head;
    private List<Department> departments;

    public FacultyCreator(String name, Human head, List<Department> departments) {
        this.name = name;
        this.head = head;
        this.departments = departments;
    }

    @Override
    public Faculty create() {
        Faculty faculty = new Faculty(name, head);
        for (Department d : departments) {
            faculty.addDepartment(d);
        }
        return faculty;
    }
}
