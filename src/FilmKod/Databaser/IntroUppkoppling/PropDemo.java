package FilmKod.Databaser.IntroUppkoppling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class PropDemo {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("src/FilmKod/Databaser/IntroUppkoppling/settings.properties"));

        try (Connection c = DriverManager.getConnection(
                p.getProperty("connectionString"),
                p.getProperty("name"),
                p.getProperty("password"));

             Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("select id, name, address from child")
        ) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String adress = rs.getString("address");
                String name = rs.getString("name");

                System.out.println(id + " " + name + " " + adress);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}