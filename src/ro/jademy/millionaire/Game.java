package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private int currentLevel = 1;

    ArrayList<Question> allQuestionsList = new ArrayList<>();

    private Scanner scanner;

    public Game(ArrayList<Question> gameQuestions, Scanner scanner) {
        this.allQuestionsList.addAll(gameQuestions);
        this.scanner = scanner;
    }


    public void askQuestion() {
        //show question on screen
        for (Question question : allQuestionsList) {
            if (question.getDifficultyLevel() == currentLevel) {
                question.showQuestion();
            }
        }


    }
    public void start () {
        askQuestion();
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
