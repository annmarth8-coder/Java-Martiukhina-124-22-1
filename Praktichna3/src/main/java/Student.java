package model;

public class Student extends Human {
    private String groupName;

    public Student(String firstName, String lastName, String middleName, Sex sex, String groupName) {
        super(firstName, lastName, middleName, sex);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
