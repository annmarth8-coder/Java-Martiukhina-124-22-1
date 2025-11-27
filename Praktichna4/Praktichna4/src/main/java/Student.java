package model;

import java.util.Objects;

public class Student extends Human {
    private String groupName;

    public Student(String firstName, String lastName, String middleName, Sex sex, String groupName) {
        super(firstName, lastName, middleName, sex);
        this.groupName = groupName;
    }

    public String getGroupName() { return groupName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), groupName);
    }

    @Override
    public String toString() {
        return super.toString() + " [" + groupName + "]";
    }
}
