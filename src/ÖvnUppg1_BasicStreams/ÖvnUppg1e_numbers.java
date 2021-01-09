package ÖvnUppg1_BasicStreams;

import java.util.List;

public class ÖvnUppg1e_numbers {

    public long getAmountOfBooks(List<Book> list){
        return list.stream().filter(b -> b.getOwner().equalsIgnoreCase("Sigrun"))
                .filter(b -> b.getColor().equalsIgnoreCase("röd")).count();
    }

    public double getAverageGrade(List<Book> list){
        return list.stream().mapToDouble(e -> e.getRating()).sum() / list.size();
    }

    public double getAverageGrade2(List<Book> list){
        return list.stream().mapToDouble(e -> e.getRating()).summaryStatistics().getAverage();
    }

    public boolean hasTimFerriss(List<Book> list){
        return list.stream().anyMatch(s -> s.getAuthor().equalsIgnoreCase("J.R.R. Tolkien"));

    }



    public ÖvnUppg1e_numbers(){

        List<Book> list = BookUtil.getBookList();
        System.out.println(getAmountOfBooks(list));
        System.out.println(getAverageGrade(list));
        System.out.println(getAverageGrade2(list));
        System.out.println(hasTimFerriss(list));
    }

    public static void main(String[] args){
        ÖvnUppg1e_numbers öu = new ÖvnUppg1e_numbers();
    }
}
