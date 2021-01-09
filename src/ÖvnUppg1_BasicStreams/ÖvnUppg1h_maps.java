package ÖvnUppg1_BasicStreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class ÖvnUppg1h_maps {

    public Map<Boolean, List<Book>> thisIsFact(List<Book> list){
        return list.stream().collect(partitioningBy(b -> b.isFact()));
    }

    public Map<String, List<Book>> authorMap(List<Book> list){
        return list.stream().collect(groupingBy(b -> b.getAuthor()));
    }

    public Map<String, List<Book>> colorMap(List<Book> list){
        return list.stream().collect(groupingBy(b -> b.getColor()));
    }



    public ÖvnUppg1h_maps(){

        List<Book> list = BookUtil.getBookList();
        thisIsFact(list).forEach(
                (k,v )-> System.out.println(k+" "+v.stream()
                                .map(Book::getTitle).collect(Collectors.toList())));

        System.out.println();
        authorMap(list).forEach(
                (k,v )-> System.out.println(k+" "+v.stream()
                        .map(Book::getTitle).collect(Collectors.toList())));

        System.out.println();
        colorMap(list).forEach(
                (k,v )-> System.out.println(k+" "+v.stream()
                        .map(Book::getTitle).collect(Collectors.toList())));

    }

    public static void main(String[] args){
        ÖvnUppg1h_maps öu = new ÖvnUppg1h_maps();
    }
}
