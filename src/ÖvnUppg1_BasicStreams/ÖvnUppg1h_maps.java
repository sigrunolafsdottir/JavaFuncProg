package ÖvnUppg1_BasicStreams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ÖvnUppg1h_maps {

    public Map<Boolean, List<Book>> thisIsFact(List<Book> list){
        return list.stream().collect(partitioningBy(b -> b.isFact()));
    }

    public Map<Boolean, List<String>> thisIsFact2(List<Book> list){
        Map<Boolean, List<Book>> tempMap = list.stream().collect(partitioningBy(b -> b.isFact()));
        Map<Boolean, List<String>> finalMap = new HashMap();

        for (Map.Entry<Boolean, List<Book>> entry : tempMap.entrySet()) {
            finalMap.put(entry.getKey(), entry.getValue().stream().map(Book::getTitle).toList());
        }

        return finalMap;
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
               // (k,v )-> System.out.println(k+" "+v));
            (k,v )-> System.out.println(k+" "+v.stream()
                                .map(Book::getTitle).toList()));

        System.out.println();
        thisIsFact2(list).forEach(
                (k,v )-> System.out.println(k+" "+v));



        System.out.println("1");
        authorMap(list).forEach(
                (k,v )-> System.out.println(k+" "+v.stream()
                        .map(Book::getTitle).toList()));

        System.out.println("2");
        colorMap(list).forEach(
                (k,v )-> System.out.println(k+" "+v.stream()
                        .map(Book::getTitle).toList()));

    }

    public static void main(String[] args){
        ÖvnUppg1h_maps öu = new ÖvnUppg1h_maps();
    }
}
