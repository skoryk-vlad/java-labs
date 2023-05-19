package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Group;
import edu.nmu.skoryk.model.Human;
import edu.nmu.skoryk.model.Sex;
import edu.nmu.skoryk.model.Student;

import java.util.List;

public class GroupCreator implements IStructureCreator<Group, Student> {
    @Override
    public Group createStructure(String name, Human head, List<Student> students) {
        return new Group(name, head, students);
    }

    @Override
    public Group createStructure(String name, Human head) {
        return new Group(name, head);
    }

    @Override
    public Group createTypicalEntity() {
        Human head = new HumanCreator().createTypicalEntity();
        return new Group(IEntityCreator.generateRandomWord(), head);
    }
}
