package edu.nmu.skoryk;

import edu.nmu.skoryk.controller.FacultyCreator;
import edu.nmu.skoryk.controller.HumanCreator;
import edu.nmu.skoryk.controller.UniversityCreator;
import edu.nmu.skoryk.model.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        HumanCreator humanCreator = new HumanCreator();
        Human head = humanCreator.createTypicalEntity();

        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.createTypicalEntity();
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);

        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalEntity();

        university.setHead(head);
        university.setFaculties(faculties);
        System.out.println(university.getHead().getHumanInfo());
        System.out.println(university.getFaculties().get(0).getHead().getHumanInfo());
    }
}