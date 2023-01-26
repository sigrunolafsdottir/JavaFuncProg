package FilmKod.Databaser.IntroUppkoppling.PreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Repository {

    List<Child> getChildren() throws IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("src/FilmKod/Databaser/IntroUppkoppling/settings.properties"));

        try (Connection c = DriverManager.getConnection(
                p.getProperty("connectionString"),
                p.getProperty("name"),
                p.getProperty("password"));

             Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("select id, name, address from child")
        ) {

            List<Child> child = new ArrayList<>();

            while (rs.next()) {
                Child temp = new Child(rs.getInt("id"),rs.getString("name"),
                        rs.getString("address") );
                child.add(temp);
            }

            return child;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    List<Child> getChildByName(String name) throws IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("src/FilmKod/Databaser/IntroUppkoppling/settings.properties"));

        try (Connection c = DriverManager.getConnection(
                p.getProperty("connectionString"),
                p.getProperty("name"),
                p.getProperty("password"));

             PreparedStatement stmt = c.prepareStatement("select id, name, address from child where name = ?");

        ) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            List<Child> child = new ArrayList<>();

            while (rs.next()) {
                Child temp = new Child(rs.getInt("id"),rs.getString("name"),
                        rs.getString("address") );
                child.add(temp);
            }

            return child;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void insertChild(String name, String address, int countryId) throws IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("src/FilmKod/Databaser/IntroUppkoppling/settings.properties"));

        try (Connection c = DriverManager.getConnection(
                p.getProperty("connectionString"),
                p.getProperty("name"),
                p.getProperty("password"));

             PreparedStatement stmt = c.prepareStatement(
                     "insert into child (name, address, countryId) values(?,?,?)");

        ) {
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setInt(3, countryId);

            int res = stmt.executeUpdate();
            System.out.println(res+ " antal rader uppdaterades");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
