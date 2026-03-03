package _02_Woche._07_tag_design_pattern_und_db;

import java.sql.*;

public class MySQLPreparedStatement {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Verbindung erfolgreich hergestellt!");

            // INSERT: neuen User einfügen
            insertUser(connection, "Anna");

            // SELECT: alle User anzeigen
            selectUsers(connection);

            // DELETE: wieder löschen
            deleteUser(connection, "Anna");

            // SELECT: nochmal anzeigen
            selectUsers(connection);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // INSERT mit PreparedStatement
    /*  INSERT mit PreparedStatement – warum es sicher ist:

            1) SQL-Template:
               String sql = "INSERT INTO users (name) VALUES (?)";
               → Das Fragezeichen (?) ist ein Platzhalter für einen Wert.
               → Die Struktur der SQL-Anweisung ist festgelegt und kann nicht manipuliert werden.

            2) Wert einfügen:
               preparedStatement.setString(1, name);
               → Die Eingabe 'name' wird **nicht** als SQL-Code interpretiert,
                 sondern nur als Datenwert.
               → Auch wenn ein Angreifer versucht, z.B. "'; DROP TABLE users; --" einzugeben,
                 wird es **nicht ausgeführt**, sondern einfach als normaler String gespeichert.

            3) Ausführen:
               preparedStatement.executeUpdate();
               → Die Datenbank fügt den Datensatz ein, ohne dass SQL-Injection möglich ist.

            4) Zusammenfassung:
               - SQL und Daten sind strikt getrennt
               - Keine Manipulation der SQL-Logik durch Benutzereingaben
               - Sicher gegen klassische SQL-Injection-Angriffe
            */
    private static void insertUser(Connection connection, String name) throws SQLException {
        String sql = "INSERT INTO users (name) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            System.out.println("User '" + name + "' eingefügt!");
        }
    }

    // SELECT mit PreparedStatement
    private static void selectUsers(Connection connection) throws SQLException {
        String sql = "SELECT id, name FROM users";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("\nAktuelle User:");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        }
    }

    // DELETE mit PreparedStatement
    private static void deleteUser(Connection connection, String name) throws SQLException {
        String sql = "DELETE FROM users WHERE name = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name); // 1 ist der erste Platzhalter im SQL-Statement
            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " User '" + name + "' gelöscht!");
        }
    }
}
