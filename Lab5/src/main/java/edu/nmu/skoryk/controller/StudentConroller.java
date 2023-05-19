package edu.nmu.skoryk.controller;

import edu.nmu.skoryk.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentConroller {
    private static final Connection connection = DBManager.getConnection();

    public static List<Student> findStudentsByMonthAndYear(int month, int year) {
        List<Student> students = new ArrayList<>();

        try {
            String query = "SELECT * FROM students WHERE EXTRACT(MONTH FROM birth_date) = ? AND EXTRACT(YEAR FROM birth_date) = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, month);
            statement.setInt(2, year);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String lastName = resultSet.getString("last_name");
                String firstName = resultSet.getString("first_name");
                String patronymic = resultSet.getString("patronymic");
                Date birthDate = resultSet.getDate("birth_date");
                String studentId = resultSet.getString("number");

                students.add(new Student(
                            id,
                            lastName,
                            firstName,
                            patronymic,
                            birthDate,
                            studentId
                        )
                );
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
