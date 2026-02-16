package ÖvnUppg1_BasicStreams;

import krafs.Person;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ÖvnUppg1f_sorting {

    //inte så bra för titlarna kastas bort
    public void getBooksInRatingOrder2(List<Book> list){
        list.stream().map(Book::getRating)
                .sorted().forEach(b -> System.out.println(b));

    }


    public void getBooksInRatingOrder(List<Book> list){
        list.stream().sorted((p1, p2) -> ((Integer)p1.getRating()).compareTo(p2.getRating()))
                .forEach(b -> System.out.println(b.getTitle()));

    }

    //nyare sätt att sortera efter en viss variabel
    public void getBooksInRatingOrder3(List<Book> list){
        list.stream().sorted(Comparator.comparing(Book::getRating))
                .forEach(b -> System.out.println(b.getTitle()));

    }


    public void getTitlesInOrder(List<Book> list){

        Collator c = Collator.getInstance(new Locale("sv", "SE"));
        list.stream().map(Book::getTitle)
                .sorted(c).forEach(b -> System.out.println(b));

    }

    public void getTitlesInOrder2(List<Book> list){

        Collator coll = Collator.getInstance(new Locale("sv", "SE"));

        List<Book> sorted = list.stream()
                .sorted(Comparator.comparing(b -> b.getAuthor().split(" ")[1], coll))
                .toList();

        sorted.forEach(b -> System.out.println(b.getAuthor()+" "+b.getTitle()));


    }




    public ÖvnUppg1f_sorting(){

        List<Book> list = BookUtil.getBookList();
        getBooksInRatingOrder2(list);
        System.out.println();
        getBooksInRatingOrder(list);
        System.out.println();
        getBooksInRatingOrder3(list);
        System.out.println();

        getTitlesInOrder(list);
        System.out.println();
        getTitlesInOrder2(list);
    }

    public static void main(String[] args){
        ÖvnUppg1f_sorting öu = new ÖvnUppg1f_sorting();
    }
}
