package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private int currentLevel = 1;

    ArrayList<Question> allQuestionsList = new ArrayList<>();

    public Game() {
        //initializam intrebarile si jocul (dificultatea/intrebarile/raspunsurile/utilizatorul

        List<Answer> answer1 = new ArrayList<>();
        Answer q1a1 = new Answer("q1a1");
        Answer q1a2 = new Answer("q1a2");
        Answer q1a3 = new Answer("q1a3");
        Answer q1a4 = new Answer("q1a3", true);

        answer1.add(q1a1);
        answer1.add(q1a2);
        answer1.add(q1a3);
        answer1.add(q1a4);


        Question question1 = new Question("What is the first question?", 1, answer1);

        List<Answer> answer2 = new ArrayList<>();
        Answer q2a1 = new Answer("q2a1");
        Answer q2a2 = new Answer("q2a2");
        Answer q2a3 = new Answer("q2a3");
        Answer q2a4 = new Answer("q2a4", true);

        answer2.add(q2a1);
        answer2.add(q2a2);
        answer2.add(q2a3);
        answer2.add(q2a4);

        Question question2 = new Question("What is the second question?", 1, answer2);

        List<Answer> answer3 = new ArrayList<>();
        Answer q3a1 = new Answer("q3a1");
        Answer q3a2 = new Answer("q3a2");
        Answer q3a3 = new Answer("q3a3");
        Answer q3a4 = new Answer("q3a4", true);

        answer3.add(q3a1);
        answer3.add(q3a2);
        answer3.add(q3a3);
        answer3.add(q3a4);

        Question question3 = new Question("What is the second question?", 2, answer3);

        List<Answer> answer4 = new ArrayList<>();
        Answer q4a1 = new Answer("q4a1");
        Answer q4a2 = new Answer("q4a2");
        Answer q4a3 = new Answer("q4a3");
        Answer q4a4 = new Answer("q4a4", true);

        answer4.add(q4a1);
        answer4.add(q4a2);
        answer4.add(q4a3);
        answer4.add(q4a4);

        Question question4 = new Question("What is the third question?", 2, answer4);

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        this.allQuestionsList.addAll(questions);

    }

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
