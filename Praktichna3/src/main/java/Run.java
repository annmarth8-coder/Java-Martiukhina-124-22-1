import controller.*;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println("University: " + university.getName());
        for (Faculty f : university.getFaculties()) {
            System.out.println("  Faculty: " + f.getName());
            for (Department d : f.getDepartments()) {
                System.out.println("    Department: " + d.getName());
                for (Group g : d.getGroups()) {
                    System.out.println("      Group: " + g.getName());
                    for (Student s : g.getStudents()) {
                        System.out.println("        Student: " + s);
                    }
                }
            }
        }
    }

    public static University createTypicalUniversity() {
        // Створення студентів
        Student s1 = new StudentCreator("Anna", "Martiukhina", "Denisovna", Sex.FEMALE, "CS-101").create();
        Student s2 = new StudentCreator("Ivan", "Petrov", "Sergeevich", Sex.MALE, "CS-101").create();
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        // Створення групи
        Group group = new GroupCreator("CS-101", s1, students).create();
        List<Group> groups = new ArrayList<>();
        groups.add(group);

        // Створення кафедри
        Department dep = new DepartmentCreator("Computer Science", s2, groups).create();
        List<Department> departments = new ArrayList<>();
        departments.add(dep);

        // Створення факультету
        Faculty faculty = new FacultyCreator("Faculty of IT", s1, departments).create();
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);

        // Створення університету
        return new UniversityCreator("National University", s1, faculties).create();
    }
}
