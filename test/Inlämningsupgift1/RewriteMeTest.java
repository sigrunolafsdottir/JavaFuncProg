package Inlämningsupgift1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;


public class RewriteMeTest {

    public Database database = new Database();
    public List<Question> questions = database.getQuestions();
    RewriteMe x = new RewriteMe();


    @Test
    final void getAmountOfQuestionsInDatabaseTest(){
        assertEquals(6, x.getAmountOfQuestionsInDatabase());
    }

    @Test
    final void getListOfAllQuestionsTest(){
        List <String> allQs = x.getListOfAllQuestions();

        assertTrue(allQs.contains("Huvudingrediensen i paella?"));
        assertTrue(allQs.contains("Huvudingrediensen i Janssons Frestelse?"));
        assertTrue(allQs.contains("Vilken person levde på 1300-talet?"));
        assertTrue(allQs.contains("Vilket är inte ett grundämne?"));
        assertTrue(allQs.contains("Huvudingrediensen i risotto?"));
        assertEquals(allQs.size(), 6);
    }

    @Test
    final void getAmountOfQuestionsForACertainCategoryTest(){
        assertEquals(2, x.getAmountOfQuestionsForACertainCategory(Category.CHEMISTRY));
        assertEquals(1, x.getAmountOfQuestionsForACertainCategory(Category.HISTORY));
        assertEquals(3, x.getAmountOfQuestionsForACertainCategory(Category.FOOD));
    }


    @Test final void getAllAnswerOptionsDistinctTest(){
        List answeOptions = x.getAllAnswerOptionsDistinct();

        assertTrue(answeOptions.contains("Potatis"));
        assertTrue(answeOptions.contains("Ris"));
        assertTrue(answeOptions.contains("Couscous"));
        assertTrue(answeOptions.contains("Bröd"));
        assertTrue(answeOptions.contains("Birger Jarl"));
        assertTrue(answeOptions.contains("Karl XII"));
        assertTrue(answeOptions.contains("Gustav III"));
        assertTrue(answeOptions.contains("Gustav Adolf"));
        assertTrue(answeOptions.contains("Kalium"));
        assertTrue(answeOptions.contains("Väte"));
        assertTrue(answeOptions.contains("Silver"));
        assertTrue(answeOptions.contains("Vatten"));
        assertTrue(answeOptions.contains("Kväve"));
        assertTrue(answeOptions.contains("Flour"));
        assertTrue(answeOptions.contains("Guld"));
        assertEquals(answeOptions.size(), 15);
    }




    @Test
    final void getAllQuestionStringsBelongingACategoryTest(){
        List chemQ = x.getAllQuestionStringsBelongingACategory(Category.CHEMISTRY);
        List historyQ = x.getAllQuestionStringsBelongingACategory(Category.HISTORY);
        List foodQ = x.getAllQuestionStringsBelongingACategory(Category.FOOD);

        assertEquals(chemQ.get(0), "Vilket är inte ett grundämne?");
        assertEquals(chemQ.get(1), "Vilket är inte ett grundämne?");
        assertEquals(historyQ.get(0), "Vilken person levde på 1300-talet?");
        assertTrue(foodQ.contains("Huvudingrediensen i paella?"));
        assertTrue(foodQ.contains("Huvudingrediensen i Janssons Frestelse?"));
        assertTrue(foodQ.contains("Huvudingrediensen i risotto?"));
    }

    @Test
    final void isThisAnAnswerOption(){
        assertTrue(x.isThisAnAnswerOption("Couscous"));
        assertTrue(x.isThisAnAnswerOption("Birger Jarl"));
        assertFalse(x.isThisAnAnswerOption("sfdsfsfs"));
    }

    @Test
    final void getAnswerCandidateFrequncyTest(){
        assertEquals(x.getAnswerCandidateFrequncy("Couscous"), 4);
        assertEquals(x.getAnswerCandidateFrequncy("Guld"), 1);
        assertEquals(x.getAnswerCandidateFrequncy("fsdfdss"), 0);
    }

    @Test
    final void getQuestionGroupedByCategoryTest() {
        Map<Category, List<String>> categoryQuestionMap =
                x.getQuestionGroupedByCategory();

        assertTrue(categoryQuestionMap.containsKey(Category.FOOD));
        assertTrue(categoryQuestionMap.containsKey(Category.HISTORY));
        assertTrue(categoryQuestionMap.containsKey(Category.CHEMISTRY));

        assertEquals(categoryQuestionMap.get(Category.FOOD).size(), 3 );
        assertEquals(categoryQuestionMap.get(Category.HISTORY).size(), 1 );
        assertEquals(categoryQuestionMap.get(Category.CHEMISTRY).size(), 2 );

        assertTrue(categoryQuestionMap.get(Category.FOOD).contains("Huvudingrediensen i paella?"));
        assertTrue(categoryQuestionMap.get(Category.HISTORY).contains("Vilken person levde på 1300-talet?"));
        assertTrue(categoryQuestionMap.get(Category.CHEMISTRY).contains("Vilket är inte ett grundämne?"));

    }

    @Test
    final void getLongestLettercountAnwerInAGivenCategoryTest(){
        assertEquals(x.getLongestLettercountAnwerInAGivenCategory(Category.FOOD), "Couscous");
        assertEquals(x.getLongestLettercountAnwerInAGivenCategory(Category.CHEMISTRY), "Couscous");
        assertEquals(x.getLongestLettercountAnwerInAGivenCategory(Category.HISTORY), "Gustav Adolf");
        assertNotEquals(x.getLongestLettercountAnwerInAGivenCategory(Category.HISTORY), "Birger Jarl");
    }


}
