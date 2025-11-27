package controller;

import model.Faculty;
import model.Human;
import model.University;

import java.util.List;

public class UniversityCreator implements Creator<University> {

    private String name;
    private Human head;
    private List<Faculty> faculties;

    public UniversityCreator(String name, Human head, List<Faculty> faculties) {
        this.name = name;
        this.head = head;
        this.faculties = faculties;
    }

    @Override
    public University create() {
        University university = new University(name, head);
        for (Faculty f : faculties) {
            university.addFaculty(f);
        }
        return university;
    }
}
