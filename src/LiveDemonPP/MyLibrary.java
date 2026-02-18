package LiveDemonPP;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyLibrary {

    BookUtil bu = new BookUtil();
    List<Book> books = bu.getBookList();

    public List<Book> getBooksByAuthor(String author, List<Book> mybooks) {
        return mybooks
                .stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .toList();

    }

    public List<Book> getBooksByColor(String color, List<Book> mybooks) {
        return mybooks
                .stream()
                .filter(b -> b.getColor().equalsIgnoreCase(color))
                .toList();

    }

    public long numberOfBooksBelongingTo(String owner, List<Book> mybooks) {
        return mybooks
                .stream()
                .filter(b -> b.getOwner().equalsIgnoreCase(owner))
                .count();
    }

    public List<Book> higherOrderFunction(BiPredicate<Book, String> p, List<Book> mybooks, String s) {
        return mybooks
                .stream()
                .filter(b -> p.test(b, s))
                .toList();
    }



    void main(){

        getBooksByAuthor("J.R.R. Tolkien", books)
                .forEach(b -> System.out.println(b.getTitle()));

        System.out.println();
        getBooksByAuthor("Kim Stanley Robinson", books).stream().map(b -> b.getTitle())
                .forEach(System.out::println);

        System.out.println();
        getBooksByAuthor("Kim Stanley Robinson", books).stream().map(Book::getAuthor)
                .forEach(System.out::println);

        System.out.println();
        getBooksByColor("Röd", books)
                .forEach(b -> System.out.println(b.getTitle()));

        System.out.println();
        IO.println(numberOfBooksBelongingTo("sigrun", books));

        System.out.println();
        BiPredicate<Book, String> bp =  (b, s) -> b.getColor().equalsIgnoreCase(s);
        BiPredicate<Book, String> bp2 =  (b, s) -> b.getAuthor().equalsIgnoreCase(s);

        higherOrderFunction(bp, books, "grön").forEach(b -> System.out.println(b.getTitle()));
        higherOrderFunction(bp2, books, "Kim Stanley Robinson").forEach(b -> System.out.println(b.getTitle()));


    }

}
