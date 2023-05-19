package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Faculty;
import edu.nmu.skoryk.model.Group;
import edu.nmu.skoryk.model.Human;
import edu.nmu.skoryk.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator implements IStructureCreator<University, Faculty> {
    @Override
    public University createStructure(String name, Human head, List<Faculty> faculties) {
        return new University(name, head, faculties);
    }

    @Override
    public University createStructure(String name, Human head) {
        return new University(name, head);
    }

    @Override
    public University createTypicalEntity() {
        FacultyCreator facultyCreator = new FacultyCreator();
        List<Faculty> faculties = new ArrayList<>();
        for (int i = 0; i < ITEMS_TO_CREATE; i++) {
            faculties.add(facultyCreator.createTypicalEntity());
        }

        Human head = new HumanCreator().createTypicalEntity();
        return new University(IEntityCreator.generateRandomWord(), head, faculties);
    }
}
