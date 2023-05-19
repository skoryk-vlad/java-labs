package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Department;
import edu.nmu.skoryk.model.Faculty;
import edu.nmu.skoryk.model.Group;
import edu.nmu.skoryk.model.Human;

import java.util.ArrayList;
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
        DepartmentCreator departmentCreator = new DepartmentCreator();
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < ITEMS_TO_CREATE; i++) {
            departments.add(departmentCreator.createTypicalEntity());
        }

        Human head = new HumanCreator().createTypicalEntity();
        return new Faculty(IEntityCreator.generateRandomWord(), head, departments);
    }
}
