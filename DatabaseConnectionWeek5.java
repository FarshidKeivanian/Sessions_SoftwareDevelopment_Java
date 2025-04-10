package com.example.javafxlayoutstylingfileioweek5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectionWeek5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root"; // Change if you use a different MySQL username
        String password = ""; // empty password

        try {
            // Connect
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL successfully.");

            // Query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Output results
            System.out.println("Students in the Database:");
            while (rs.next()) {
                System.out.println("👤 " + rs.getString("name") + " (Age: " + rs.getInt("age") + ")");
            }

            // Close
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
