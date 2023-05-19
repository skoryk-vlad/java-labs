package edu.nmu.skoryk.model;

import java.util.List;

public class Faculty extends BaseStructure {
    private List<Department> departments;
    public Faculty(String name, Human head) {
        super(name, head);
    }
    public Faculty(String name, Human head, List<Department> departments) {
        super(name, head);
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
