package controller;

import model.Sex;
import model.Student;

public class StudentCreator implements Creator<Student> {

    private String firstName;
    private String lastName;
    private String middleName;
    private Sex sex;
    private String groupName;

    // Конструктор
    public StudentCreator(String firstName, String lastName, String middleName, Sex sex, String groupName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
        this.groupName = groupName;
    }

    // Створюємо студента
    @Override
    public Student create() {
        return new Student(firstName, lastName, middleName, sex, groupName);
    }
}
