package ÖvnUppg1_BasicStreams;

import java.util.List;

public class ÖvnUppg1e_numbers {

    final List<Book> list = BookUtil.getBookList();

    public long getAmountOfBooks(List<Book> list){
        return list.stream().filter(b -> b.getOwner().equalsIgnoreCase("Sigrun"))
                .filter(b -> b.getColor().equalsIgnoreCase("röd")).count();
    }

    public double getAverageGrade(List<Book> list){
        return list.stream().mapToDouble(e -> e.getRating()).sum() / list.size();
    }

    public double getAverageGrade3(List<Book> list){
        return list.stream().mapToDouble(e -> e.getRating()).average().getAsDouble();
    }

    public double getAverageGrade2(List<Book> list){
        return list.stream().mapToDouble(e -> e.getRating()).summaryStatistics().getAverage();
    }

    public boolean hasTimFerriss(List<Book> list){
        return list.stream().anyMatch(s -> s.getAuthor().equalsIgnoreCase("Tim Ferriss"));
    }

    public boolean hasDHBJSF(List<Book> list){
        return list.stream().anyMatch(s -> s.getAuthor().equalsIgnoreCase("DHBJSF"));
    }



    public ÖvnUppg1e_numbers(){

        System.out.println(getAmountOfBooks(list));
        System.out.println(getAverageGrade(list));
        System.out.println(getAverageGrade2(list));
        System.out.println(hasTimFerriss(list));
        System.out.println(hasDHBJSF(list));
    }

    public static void main(String[] args){
        ÖvnUppg1e_numbers öu = new ÖvnUppg1e_numbers();
    }
}
