package Inlämningsupgift1;

import java.util.Arrays;
import java.util.List;


public class Database {
    
    protected List<Question> questions;
    
    public Database(){
        Question q1 = new Question("Huvudingrediensen i paella?", 
                "Potatis", "Ris", "Couscous", "Bröd", Category.FOOD, 1);
        Question q2 = new Question("Huvudingrediensen i Janssons Frestelse?", 
                "Potatis", "Ris", "Couscous", "Bröd", Category.FOOD, 0);
        Question q3 = new Question("Vilken person levde på 1300-talet?", 
                "Birger Jarl", "Karl XII", "Gustav III", "Gustav Adolf", Category.HISTORY, 0);
        Question q4 = new Question("Vilket är inte ett grundämne?", 
                "Kalium", "Väte", "Silver", "Vatten", Category.CHEMISTRY, 3);
        Question q5 = new Question("Vilket är inte ett grundämne?", 
                "Kväve", "Flour", "Couscous", "Guld", Category.CHEMISTRY, 2);
        Question q6 = new Question("Huvudingrediensen i risotto?", 
                "Potatis", "Ris", "Couscous", "Bröd", Category.FOOD, 1);
    
        questions = Arrays.asList(q1, q2, q3, q4, q5, q6);
    }
    
    public List<Question> getQuestions(){
        return questions;
    }

}
