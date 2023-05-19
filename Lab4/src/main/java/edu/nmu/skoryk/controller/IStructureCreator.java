package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Human;

import java.util.List;

public interface IStructureCreator<T, C> extends IEntityCreator<T> {
    int ITEMS_TO_CREATE = 2;

    T createStructure(String name, Human head, List<C> items);

    T createStructure(String name, Human head);
}
