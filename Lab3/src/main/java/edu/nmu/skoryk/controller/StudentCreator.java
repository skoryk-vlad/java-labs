package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Human;
import edu.nmu.skoryk.model.Sex;
import edu.nmu.skoryk.model.Student;

public class StudentCreator implements IEntityCreator<Student> {
    public Student createEntity(String firstName, String lastName, String patronymic, Sex gender) {
        return new Student(firstName, lastName, patronymic, gender);
    }

    @Override
    public Student createTypicalEntity() {
        return new Student(
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomGender()
        );
    }
}
