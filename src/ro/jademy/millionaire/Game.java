package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private int currentLevel = 1;

    ArrayList<Question> allQuestionsList = new ArrayList<>();

        //initializam intrebarile si jocul (dificultatea/intrebarile/raspunsurile/utilizatorul


    public void askQuestion() {
        //show question on screen
        for (Question question : allQuestionsList) {
            if (question.getDifficultyLevel() == currentLevel) {
                question.showQuestion();
            }
        }


    }

    public void answerQuestion() {
        //get user input and check if correct
    }

    public void fiftyFifty() {
        //show the same question but with only two possible answers
    }

    public void exitGame() {
    }

}
