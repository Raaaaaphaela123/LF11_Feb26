package _02_Woche._07_tag_design_pattern_und_db;

import javax.swing.*;
import java.sql.*;

public class SQLInjectionDemo {
    private static final String URL = "jdbc:mysql://localhost:3307/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // 1) Unsichere Abfrage (SQL-Injection möglich) ' OR '1'='1 -> 1 = 1 ist immer wahr
            String userName = JOptionPane.showInputDialog("Unsicher: Benutzername eingeben:");
            Statement statement = connection.createStatement();
            String unsafeSql = "SELECT * FROM users WHERE name = '" + userName + "'";
            ResultSet resultSet = statement.executeQuery(unsafeSql);

            StringBuilder unsafeResult = new StringBuilder("Ergebnis:\n");
            while (resultSet.next()) {
                unsafeResult.append("ID: ").append(resultSet.getInt("id")).append(", Name: ")
                        .append(resultSet.getString("name")).append(", Passwort: ")
                        .append(resultSet.getString("password")).append("\n");
            }
            JOptionPane.showMessageDialog(null, unsafeResult.toString());

            /*
                Eingabe des Angreifers:
                ' OR '1'='1

                Zusammengebautes SQL-Statement durch String-Verkettung:

                SELECT * FROM users WHERE name = '' OR '1'='1'

                Auswertung durch die Datenbank Schritt für Schritt:
                1) SELECT * FROM users
                   → Wähle alle Spalten aus der Tabelle "users"
                2) WHERE ...
                   → Filtere nur die Zeilen, für die die Bedingung wahr ist
                3) name = ''
                   → Vergleicht die Spalte "name" mit einem leeren String
                   → Für normale Datensätze: FALSE
                4) OR
                   → Logisches ODER: Wenn eine Seite TRUE ist, ist alles TRUE
                5) '1' = '1'
                   → Vergleich zweier identischer Strings
                   → Immer TRUE
                6) Gesamtausdruck:
                   (name = '') OR ('1' = '1')
                   (FALSE)      OR (TRUE)
                   → TRUE
                7) Ergebnis:
                   Die WHERE-Bedingung ist für JEDE Zeile TRUE,
                   deshalb gibt die Datenbank ALLE Benutzer zurück.
                */

            // 2) Sichere Abfrage mit PreparedStatement (Injection wird verhindert)
            String safeInput = JOptionPane.showInputDialog("Sicher: Benutzername eingeben:");
           // ALT: String unsafeSql = "SELECT * FROM users WHERE name = '" + userName + "'";

            String safeSql = "SELECT * FROM users WHERE name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(safeSql);
            preparedStatement.setString(1, safeInput);
            resultSet = preparedStatement.executeQuery();

            StringBuilder safeResult = new StringBuilder("Sicheres Ergebnis:\n");
            while (resultSet.next()) {
                safeResult.append("ID: ").append(resultSet.getInt("id")).append(", Name: ")
                        .append(resultSet.getString("name")).append(", Passwort: ")
                        .append(resultSet.getString("password")).append("\n");
            }
            JOptionPane.showMessageDialog(null, safeResult.toString());

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Fehler beim Zugriff auf die Datenbank!");
        }
    }


}
