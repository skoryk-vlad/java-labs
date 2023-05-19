package edu.nmu.skoryk.model;

import java.util.List;

public class Department extends BaseStructure {
    private List<Group> groups;
    public Department(String name, Human head) {
        super(name, head);
    }
    public Department(String name, Human head, List<Group> groups) {
        super(name, head);
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
