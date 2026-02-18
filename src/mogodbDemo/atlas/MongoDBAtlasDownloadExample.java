package mogodbDemo.atlas;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


public class MongoDBAtlasDownloadExample {

   // SearchMethods sm = new SearchMethods();

    public MongoDBAtlasDownloadExample() {

        //Skriv in rätt url!
        String uri = "mongodb+srv://<your-username>:<your-password>@<yourCluster>.mongodb.net/?retryWrites=true&w=majority";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("sample_mflix");
            MongoCollection<Document> moviesCollection = database.getCollection("movies");

            //Get all movies from 1975
            List<Movie> movieList = new ArrayList<>();
            for (Document doc : moviesCollection.find(new Document("year", 1975))) {
                {
                    movieList.add(Movie.fromDocument(doc));
                }
            }

            // Skriver ut alla filmer
            for (Movie movie : movieList) {
                System.out.println(movie);
            }



            //Här gör du anrop till alla dina funktioner som ska skriva ut svaren på frågorna som
            //efterfrågas i uppgiften
/*
            System.out.println("Amount of movies: "+sm.howManyMovies(movieList));
            System.out.println("Length of longest movie: "+ sm.lengthOfLongestMovie(movieList));
            System.out.println("Amount of unique genres "+sm.howManyUniqueGenres(movieList));
            System.out.println("Actors in highest rated movie "+sm.actorsInHighestRatedMovie(movieList));
            System.out.println("Movie with fewest actors "+sm.movieWithTheFewestActorsListed(movieList));
            System.out.println("Amount of unique languages: "+sm.allUniqueLanguages(movieList));
            System.out.println("Has doublette titles: "+sm.anyDoubletteTitles(movieList));
            System.out.println("Amount of actors in more movies "+sm.amountOfActorsInMoreThanOneMovie(movieList));
            System.out.println("Actor in the most movies: "+sm.actorInTheMostMovies(movieList));
*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MongoDBAtlasDownloadExample m = new MongoDBAtlasDownloadExample();
    }
}
