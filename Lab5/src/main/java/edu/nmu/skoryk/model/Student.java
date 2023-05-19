package edu.nmu.skoryk.model;

import java.util.Date;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date birthDate;
    private String number;

    public Student(Integer id, String firstName, String lastName, String patronymic, Date birthDate, String number) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student " + id + ": {\n" +
                "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "middleName: " + patronymic + "\n" +
                "birthDate: " + birthDate + "\n" +
                "number: " + number + '\n' +
                "}";
    }
}