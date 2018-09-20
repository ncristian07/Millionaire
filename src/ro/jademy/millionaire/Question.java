package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private static final int MAX_LEVEL = 15;
    private String question;
    private int difficultyLevel; //max 15
    private List<Answer> answerList = new ArrayList<>();

    public Question(String question, int difficultyLevel, List<Answer> answerList) {
        this.question = question;
        this.difficultyLevel = difficultyLevel;
        this.answerList.addAll(answerList);
    }

    public int getMaxLevel() {
        return MAX_LEVEL;
    }

    public String setQuestion() {
        return question;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public Answer getCorrectAnswer() {
        for (Answer answer : answerList) {
            if (answer.isCorrect()) {
                return answer;
            }
        }
        return null;
    }

    public void showQuestion() {
        System.out.println(question);
        for (int i = 0; i <= answerList.size(); i++) {
            String answerTag = answerTag(i);
            System.out.println(answerTag + answerList.get(i));
        }

    }

    private String answerTag(int i) {
        switch (i) {
            case 0:
                return "A.";
            case 1:
                return "B.";
            case 2:
                return "C.";
            case 3:
                return "D.";
            default:
                return "A";
        }
    }
}


