package ÖvnUppg1_BasicStreams;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class ÖvnUppg1a_filter {

    final List<Book> list = BookUtil.getBookList();

    public List<Book> getAllBooksByAnAuthor(String author, List<Book> list){
        return list.stream().filter(s -> s.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    public List<Book> getAllBooksByAColor(String color, List<Book> list){
        return list.stream().filter(s -> s.getColor().equalsIgnoreCase(color))
                .toList();
    }

    public int getNumberOfBooksBelongingToAnOwner1(String owner, List<Book> list){
        return list.stream().filter(s -> s.getOwner().equalsIgnoreCase(owner))
                .toList().size();
    }

    public long getNumberOfBooksBelongingToAnOwner2(String owner, List<Book> list){
        return list.stream().filter(s -> s.getOwner().equalsIgnoreCase(owner))
                .count();
    }

    public ÖvnUppg1a_filter(){

        getAllBooksByAnAuthor("J.R.R. Tolkien", list)
                .forEach(b -> System.out.println(b.getTitle()));

        System.out.println();

        getAllBooksByAColor("röd", list)
                .forEach(b -> System.out.println(b.getTitle()));

        System.out.println();

        System.out.println(getNumberOfBooksBelongingToAnOwner1("Sigrun", list));

        System.out.println(getNumberOfBooksBelongingToAnOwner2("Sigrun", list));

    }

    public static void main(String[] args){
        ÖvnUppg1a_filter öu = new ÖvnUppg1a_filter();
    }
}
