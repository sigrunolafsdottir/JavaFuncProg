package FilmKod.Databaser.IntroUppkoppling.RepositoryDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
                Child temp = new Child();
                int id = rs.getInt("id");
                temp.setId(id);
                String adress = rs.getString("address");
                temp.setAddress(adress);
                String name = rs.getString("name");
                temp.setName(name);
                child.add(temp);
            }


            return child;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
