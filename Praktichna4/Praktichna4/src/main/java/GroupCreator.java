package controller;

import model.Group;
import model.Student;
import model.Sex;

public class GroupCreator {

    public static Group createGroup(String groupName, int studentCount, String groupHeadNamePrefix) {
        Student groupHead = new Student(groupHeadNamePrefix, "Lastname", "Middle", Sex.FEMALE, groupName);
        Group group = new Group(groupName, groupHead);

        for (int i = 1; i <= studentCount; i++) {
            Student student = new Student(
                    "Student" + i,
                    "Lastname" + i,
                    "Middle" + i,
                    (i % 2 == 0) ? Sex.FEMALE : Sex.MALE,
                    groupName
            );
            group.addStudent(student);
        }

        return group;
    }
}
