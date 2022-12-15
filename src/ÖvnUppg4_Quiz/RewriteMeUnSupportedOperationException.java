package ÖvnUppg4_Quiz;

import java.util.List;
import java.util.Map;

/*


För samtliga funktioner i denna fil, byt ut "throw UnSupportedException"-raden
och skriv ett pipeline-uttryck som returnerar det som ska returneras.

Streams MÅSTE användas i samtliga funktioner
För att testa om era funktioner funkar, kör testerna som hör till denna fil


 */

public class RewriteMeUnSupportedOperationException {
    
    public Database database = new Database();
    public List<Question> questions = database.getQuestions();
    
    //Skriv en funktioner som returnerar hur många frågor det finns i databasen?
    public int getAmountOfQuestionsInDatabase(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //Hur många frågor finns i databasen för en viss, given kategori (som ges som inparameter)
    public int getAmountOfQuestionsForACertainCategory(Category category){
       throw new UnsupportedOperationException("Not supported yet.");
    }

    //Skapa en lista innehållandes samtliga frågesträngar i databasen
    public List<String> getListOfAllQuestions(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //Skapa en lista innehållandes samtliga frågesträngar där frågan tillhör en viss kategori
    //Kategorin ges som inparameter
    public List<String> getAllQuestionStringsBelongingACategory(Category category){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Skapa en lista av alla svarsalternativ, där varje svarsalternativ får förekomma
    // en och endast en gång i den lista som du ska returnera
    public List<String> getAllAnswerOptionsDistinct(){
        throw new UnsupportedOperationException("Not supported yet.");
    }


    //Finns en viss sträng, given som inparameter, som svarsalternativ till någon fråga i vår databas?
    public boolean isThisAnAnswerOption(String answerCandidate){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Hur ofta förekommer ett visst svarsalternativ, givet som inparameter, i databasen
    public int getAnswerCandidateFrequncy(String answerCandidate){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Skapa en Map där kategorierna är nycklar och värdena är en lista
    //av de frågesträngar som tillhör varje kategori
    public Map<Category, List<String>> getQuestionGroupedByCategory(){
       throw new UnsupportedOperationException("Not supported yet.");
    }

    //Skapa en funktion som hittar det svarsalternativ som har flest bokstäver, i en kategori, given som inparameter
    // OBS: Du måste använda Reduce!
    public String getLongestLettercountAnwerInAGivenCategory(Category c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public static void main(String[] args){
        RewriteMeUnSupportedOperationException uppg4 = new RewriteMeUnSupportedOperationException();
        
    }

}
