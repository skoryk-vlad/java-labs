package edu.nmu.skoryk;

import edu.nmu.skoryk.controller.StudentConroller;
import edu.nmu.skoryk.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = StudentConroller.findStudentsByMonthAndYear(7, 2003);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}