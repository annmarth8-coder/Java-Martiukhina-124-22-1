package controller;

import model.University;
import model.Student;

public class UniversityCreator {

    public static University createTypicalUniversity() {
        Student rector = new Student("Ivan", "Petrov", "Sergeevich", model.Sex.MALE, "");
        University university = new University("National University", rector);

        // Додаємо 2 факультети
        for (int f = 1; f <= 2; f++) {
            university.addFaculty(
                    FacultyCreator.createFaculty(
                            "Faculty " + f,
                            2, // departments per faculty
                            2, // groups per department
                            2, // students per group
                            "FacultyHead" + f
                    )
            );
        }

        return university;
    }
}
