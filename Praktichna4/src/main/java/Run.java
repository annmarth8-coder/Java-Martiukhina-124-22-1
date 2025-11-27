package controller;

import model.University;

public class Run {
    public static void main(String[] args) {
        University university = UniversityCreator.createTypicalUniversity();
        System.out.println("Університет створено: ");
        System.out.println(university);

        JsonManager.saveUniversityToFile(university, "university.json");
        System.out.println("Університет збережено у файл university.json");

        University loadedUniversity = JsonManager.loadUniversityFromFile("university.json");
        System.out.println("Університет завантажено з файлу:");
        System.out.println(loadedUniversity);

        boolean isEqual = university.equals(loadedUniversity);
        System.out.println("Чи університети однакові? " + isEqual);
    }
}
