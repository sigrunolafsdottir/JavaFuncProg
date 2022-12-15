package FilmKod.Databaser.IntroUppkoppling;

import java.sql.*;

public class UppkopplingsDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        try(Connection c =  DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bigtomtedatabase?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                "sigrun",
                "secretpassword");
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select id, name, address from child")
        ) {

            while(rs.next()){
                int id = rs.getInt("id");
                String adress = rs.getString("address");
                String name = rs.getString("name");

                System.out.println(id+" "+name+" "+adress);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
