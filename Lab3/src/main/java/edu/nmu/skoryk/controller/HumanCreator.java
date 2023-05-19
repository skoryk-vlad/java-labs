package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Human;

public class HumanCreator implements IEntityCreator<Human> {
    @Override
    public Human createTypicalEntity() {
        return new Human(
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomGender()
        );
    }
}
