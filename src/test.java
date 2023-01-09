import java.sql.*;

class test {

    public static class ConnectionData {
        public static final String DRIVER = "com.mysql.jdbc.Driver";
        public static final String DB = "catalog";
        public static final String URL = "jdbc:mysql://localhost:3306/" + DB;
        public static final String USER = "root";
        public static final String PASSWORD = "admin";
    }

    private static final String SELECT_QUERY = "SELECT * FROM users;";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(ConnectionData.URL, ConnectionData.USER, ConnectionData.PASSWORD)) {
            try (Statement statement = connection.createStatement()) {

                ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
                System.out.printf("%-20s%s%n", "id", "username");
                System.out.println("-------------------------------");
                statement.addBatch("INSERT INTO users (username) VALUES ('sidorov')");
                statement.addBatch("INSERT INTO users (username) VALUES ('petrov')");
                statement.addBatch("INSERT INTO users (username) VALUES ('kozlov')");
                statement.executeBatch();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("username");
                    System.out.printf("%-20d%s%n", id, name);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}