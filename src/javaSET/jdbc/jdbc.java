package javaSET.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbc {

    private static List<PersonModel> getPersonByAge(int minAge, int maxAge) {
        String st = "org.postgresql.Driver";
        String url = "jdbc:postgres://database-2022.ct3islcjkcto.eu-central-1.rds.amazonaws.com:5432/testdb";
        String userName = "postgres";
        String password = "postgres";
        String request = "SELECT name, last_name, age FROM person WHERE age > ? AND age < ?";
        List<PersonModel> models = new ArrayList<>();
        try {
            Class.forName(st);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             PreparedStatement statement = connection.prepareStatement(request)) {
           statement.setInt(1,minAge);
           statement.setInt(2,maxAge);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString(1);
                String lastName = resultSet.getString(2);
                int age = resultSet.getInt(3);
                PersonModel personModel = new PersonModel(name, lastName, age);
                models.add(personModel);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return models;
    }

    public static void main(String[] args) {

    }
}