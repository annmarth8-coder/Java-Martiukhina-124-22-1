package controller;

import model.Faculty;
import model.Department;
import model.Student;
import model.Sex;

public class FacultyCreator {

    public static Faculty createFaculty(String facultyName, int departmentsPerFaculty, int groupsPerDept, int studentsPerGroup, String facultyHeadPrefix) {
        Student facultyHead = new Student(facultyHeadPrefix, "Lastname", "Middle", Sex.FEMALE, "");
        Faculty faculty = new Faculty(facultyName, facultyHead);

        for (int d = 1; d <= departmentsPerFaculty; d++) {
            Department department = DepartmentCreator.createDepartment(facultyName + " Dept " + d, groupsPerDept, studentsPerGroup, "DeptHead" + d);
            faculty.addDepartment(department);
        }

        return faculty;
    }
}
