package LiveDemonPP;

public class Book {

    private String title;
    private String author;
    private String color;
    private String owner;
    private String genre;
    private boolean fact;
    private int rating;

    public Book (String title, String author, String color, String genre, String owner,
    boolean fact, int rating){
        this.title = title;
        this.author = author;
        this.color = color;
        this.owner = owner;
        this.genre = genre;
        this.fact = fact;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isFact() {
        return fact;
    }

    public void setFact(boolean fact) {
        this.fact = fact;
    }

    public int getRating() {
        return rating;
    }

    public double getDoubleRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
