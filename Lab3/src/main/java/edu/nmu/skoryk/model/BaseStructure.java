package edu.nmu.skoryk.model;

import java.util.List;

public abstract class BaseStructure {
    private String name;
    private Human head;

    public BaseStructure(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Human head) {
        this.head = head;
    }
}
