package edu.nmu.skoryk;

import edu.nmu.skoryk.controller.JSONManager;
import edu.nmu.skoryk.controller.UniversityCreator;
import edu.nmu.skoryk.model.*;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalEntity();

        JSONManager<University> jsonManager = new JSONManager<>();

        jsonManager.writeToFile(university, "university.json");

        University universityFromFile = jsonManager.readFromFile("university.json", University.class);

        System.out.println(jsonManager.toString(universityFromFile));
    }
}