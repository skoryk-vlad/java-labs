package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Human;

import java.util.List;

public interface IStructureCreator<T, C> extends IEntityCreator<T> {
    T createStructure(String name, Human head, List<C> items);

    T createStructure(String name, Human head);
}
