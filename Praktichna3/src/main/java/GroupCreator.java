package controller;

import model.Group;
import model.Human;
import model.Student;

import java.util.List;

public class GroupCreator implements Creator<Group> {

    private String name;
    private Human head;
    private List<Student> students;

    // Конструктор
    public GroupCreator(String name, Human head, List<Student> students) {
        this.name = name;
        this.head = head;
        this.students = students;
    }

    // Створюємо групу з студентами
    @Override
    public Group create() {
        Group group = new Group(name, head);
        for (Student s : students) {
            group.addStudent(s);
        }
        return group;
    }
}
