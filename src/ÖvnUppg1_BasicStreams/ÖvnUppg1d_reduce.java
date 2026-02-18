package ÖvnUppg1_BasicStreams;

import java.util.List;
import java.util.stream.Collectors;

public class ÖvnUppg1d_reduce {

    final List<Book> list = BookUtil.getBookList();

    public double getAverageGrade(List<Book> list){
        return list.stream().map(Book::getDoubleRating)
                .reduce(0.0, (u, e) -> u+e) / list.size();

    }

    public String getallTitles(List<Book> list){
        return list.stream().map(Book::getTitle)    //["titel1, titel2 osv"]
                .reduce("", (u, e) -> u + e + ", ") ;
    }

    public ÖvnUppg1d_reduce(){

        System.out.println(getAverageGrade(list));
        System.out.println(getallTitles(list));
    }

    public static void main(String[] args){
        ÖvnUppg1d_reduce öu = new ÖvnUppg1d_reduce();
    }
}
