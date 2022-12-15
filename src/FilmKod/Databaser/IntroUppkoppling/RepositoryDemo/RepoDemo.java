package FilmKod.Databaser.IntroUppkoppling.RepositoryDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RepoDemo {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        Repository r = new Repository();
        List<Child> childList = r.getChildren();
        childList.forEach(chil -> System.out.println(chil.getName()+" "+chil.getAddress()));

    }

}