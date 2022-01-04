package ÖvnUppg1_BasicStreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ÖvnUppg1c_flatmap {

    public List<String> getAllTitles(List<List<Book>> list){
        return list.stream().flatMap(value -> value.stream())
                .map(Book::getTitle).toList();
    }



    public ÖvnUppg1c_flatmap(){

        List<List<Book>> list = BookUtil.getComplexBookList();
        getAllTitles(list).forEach(b -> System.out.println(b));
    }

    public static void main(String[] args){
        ÖvnUppg1c_flatmap öu = new ÖvnUppg1c_flatmap();
    }
}
