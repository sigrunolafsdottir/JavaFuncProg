package ÖvnUppg1_BasicStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookUtil {

    public static List<Book> getBookList(){

        Book b1 = new Book("Red Mars", "Kim Stanley Robinson",
                "röd", "sci-fi","Sigrun", false, 5);
        Book b2 = new Book("Green Mars", "Kim Stanley Robinson",
                "grön", "sci-fi","Sigrun", false, 4);
        Book b3 = new Book("Blue Mars", "Kim Stanley Robinson",
                "blå", "sci-fi", "Sigrun", false, 4);

        Book b4 = new Book("Sagan om Ringen", "J.R.R. Tolkien",
                "röd", "fantasy","Sigrun", false, 5);
        Book b5 = new Book("Sagan om de Två Tornen", "J.R.R. Tolkien",
                "röd", "fantasy","Sigrun", false, 5);
        Book b6 = new Book("Konungens återkomst", "J.R.R. Tolkien",
                "röd", "fantasy", "Sigrun", false, 5);

        Book b7 = new Book("4 hour Work Week", "Tim Ferriss",
                "vit", "fakta", "Mats", true, 5);

        Book b8 = new Book("Åååååå", "Åke Åkesson",
                "vit", "fakta", "Mats", true, 5);

        Book b9 = new Book("Äääää", "Ärling Ärnsstsson",
                "vit", "fakta", "Mats", true, 5);


        return Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9);
    }

    public static List<List<Book>> getComplexBookList(){

        Book b1 = new Book("Red Mars", "Kim Stanley Robinson",
                "röd", "sci-fi","Sigrun", false, 5);
        Book b2 = new Book("Green Mars", "Kim Stanley Robinson",
                "grön", "sci-fi","Sigrun", false, 4);
        Book b3 = new Book("Blue Mars", "Kim Stanley Robinson",
                "blå", "sci-fi", "Sigrun", false, 4);

        Book b4 = new Book("Sagan om Ringen", "J.R.R. Tolkien",
                "röd", "fantasy","Sigrun", false, 5);
        Book b5 = new Book("Sagan om de Två Tornen", "J.R.R. Tolkien",
                "röd", "fantasy","Sigrun", false, 5);
        Book b6 = new Book("Konungens återkomst", "J.R.R. Tolkien",
                "röd", "fantasy", "Sigrun", false, 5);

        Book b7 = new Book("4 hour Work Week", "Tim Ferriss",
                "vit", "fakta", "Mats", true, 5);

        List<Book> list1 = Arrays.asList(b1, b2, b3);
        List<Book> list2 = Arrays.asList(b4, b5, b6);
        List<Book> list3 = Arrays.asList(b7);

        return Arrays.asList(list1, list2, list3);
    }
}
