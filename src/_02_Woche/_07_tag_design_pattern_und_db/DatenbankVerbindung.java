package _02_Woche._07_tag_design_pattern_und_db;

import java.sql.*;

public class DatenbankVerbindung {

    static void main() {

        String dbUrl = "jdbc:mysql://localhost:3307/testdb";
        String user = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(dbUrl, user, password);
            IO.println("Verbindung erfolgreich!");

            Statement statement = connection.createStatement();
            // DELETE -> User löschen
            String deleteSQL = "DELETE FROM users WHERE name = 'Maximilian'";
            int rowsDeleted = statement.executeUpdate(deleteSQL);
            IO.println("Rows deleted: " + rowsDeleted);


            // INSERT -> neuen User hinzufügen
            String insertSQL = "INSERT INTO users (name, password) VALUES ('Max', 'Geheim123!')";
            statement.execute(insertSQL);


            // SELECT -> vorhandene Daten anzeigen lassen
            ResultSet resultSet = statement.executeQuery("SELECT id, name FROM users ORDER BY id");

            // Iteration über die gelieferten Datensätze, bis die Liste kein nächstes Element mehr hat
            while (resultSet.next()) {
                IO.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name"));
            }

            // UPDATE -> User verändern
            String updateSQL = "UPDATE users SET name = 'Maximilian' WHERE name = 'Max'";
            statement.execute(updateSQL);

            connection.close();

        } catch (SQLException e) {
            IO.println("Verbindung zur Datenbank fehlgeschlagen");
        }

    }
}
