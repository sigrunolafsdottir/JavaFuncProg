package ÖvnUppg1_BasicStreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ÖvnUppg1b_map {

    public List<String> getAllTitles(List<Book> list){
        return list.stream().map(b -> b.getTitle())
                .toList();
    }

    public List<String> getAllTitles2(List<Book> list){
        return list.stream().map(Book::getTitle)
                .toList();
    }

    public Set<String> getAllUniqueAuthors(List<Book> list){
        return list.stream().map(s -> s.getAuthor())
                .collect(Collectors.toSet());
    }

    public List<String> getAllUniqueAuthors2(List<Book> list){
        return list.stream().map(s -> s.getAuthor()).distinct()
                .toList();
    }

    public List<String> myBooksOnly(String owner, List<Book> list){
        return list.stream().filter(s -> s.getOwner().equalsIgnoreCase(owner))
                .map(b -> b.getTitle()).toList();
    }

    public ÖvnUppg1b_map(){

        List<Book> list = BookUtil.getBookList();
        getAllTitles(list).forEach(b -> System.out.println(b));
        System.out.println();

        getAllTitles2(list).forEach(b -> System.out.println(b));
        System.out.println();

        getAllUniqueAuthors(list).forEach(b -> System.out.println(b));
        System.out.println();

        getAllUniqueAuthors2(list).forEach(b -> System.out.println(b));
        System.out.println();

        System.out.println(myBooksOnly("Sigrun", list));
        
    }

    public static void main(String[] args){
        ÖvnUppg1b_map öu = new ÖvnUppg1b_map();
    }
}
