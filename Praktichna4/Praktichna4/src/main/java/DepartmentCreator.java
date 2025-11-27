package controller;

import model.Department;
import model.Group;
import model.Student;
import model.Sex;

public class DepartmentCreator {

    public static Department createDepartment(String deptName, int groupsPerDept, int studentsPerGroup, String deptHeadPrefix) {
        Student deptHead = new Student(deptHeadPrefix, "Lastname", "Middle", Sex.MALE, "");
        Department department = new Department(deptName, deptHead);

        for (int g = 1; g <= groupsPerDept; g++) {
            Group group = GroupCreator.createGroup(deptName + " Group " + g, studentsPerGroup, "GroupHead" + g);
            department.addGroup(group);
        }

        return department;
    }
}
