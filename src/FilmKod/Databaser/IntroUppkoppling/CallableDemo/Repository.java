package FilmKod.Databaser.IntroUppkoppling.CallableDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Repository {


    void addCountry(String name) throws IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("src/FilmKod/Databaser/IntroUppkoppling/settings.properties"));

        try (Connection c = DriverManager.getConnection(
                p.getProperty("connectionString"),
                p.getProperty("name"),
                p.getProperty("password"));

             CallableStatement stmt = c.prepareCall("call addCountry(?)");

        ) {
            stmt.setString(1, name);
            stmt.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void addCountryWOutParam(String name) throws IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("src/FilmKod/Databaser/IntroUppkoppling/settings.properties"));

        try (Connection c = DriverManager.getConnection(
                p.getProperty("connectionString"),
                p.getProperty("name"),
                p.getProperty("password"));

             CallableStatement stmt = c.prepareCall("call addCountry(?, ?)");

        ) {
            stmt.setString(1, name);
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.executeQuery();

            System.out.println(stmt.getString(2));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //addCountry
    void addCountryWithSelect(String name) throws IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("src/FilmKod/Databaser/IntroUppkoppling/settings.properties"));

        try (Connection c = DriverManager.getConnection(
                p.getProperty("connectionString"),
                p.getProperty("name"),
                p.getProperty("password"));

             CallableStatement stmt = c.prepareCall("call addCountry(?)");

        ) {
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //System.out.println(e.getErrorCode());
            //throw new RuntimeException(e);
        }

    }

}
