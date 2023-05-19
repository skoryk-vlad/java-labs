package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Department;
import edu.nmu.skoryk.model.Faculty;
import edu.nmu.skoryk.model.Group;
import edu.nmu.skoryk.model.Human;

import java.util.List;

public class FacultyCreator implements IStructureCreator<Faculty, Department> {
    @Override
    public Faculty createStructure(String name, Human head, List<Department> departments) {
        return new Faculty(name, head, departments);
    }

    @Override
    public Faculty createStructure(String name, Human head) {
        return new Faculty(name, head);
    }

    @Override
    public Faculty createTypicalEntity() {
        Human head = new HumanCreator().createTypicalEntity();
        return new Faculty(IEntityCreator.generateRandomWord(), head);
    }
}
