package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Department;
import edu.nmu.skoryk.model.Group;
import edu.nmu.skoryk.model.Human;

import java.util.List;

public class DepartmentCreator implements IStructureCreator<Department, Group> {
    @Override
    public Department createStructure(String name, Human head, List<Group> groups) {
        return new Department(name, head, groups);
    }

    @Override
    public Department createStructure(String name, Human head) {
        return new Department(name, head);
    }

    @Override
    public Department createTypicalEntity() {
        Human head = new HumanCreator().createTypicalEntity();
        return new Department(IEntityCreator.generateRandomWord(), head);
    }
}
