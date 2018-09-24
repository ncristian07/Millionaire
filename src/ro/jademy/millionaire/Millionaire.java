package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Millionaire {

    private static List<Question> questionsLevel1 = new ArrayList<>();
    private static List<Question> questionsLevel2 = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to play Millionaire? ");
        String answerPlayer = scan.nextLine();


    }

    private static void initQuestions() {

        List<Answer> answer1 = new ArrayList<>();
        Answer q1a1 = new WrongAnswer("q1a1");
        Answer q1a2 = new WrongAnswer("q1a2");
        Answer q1a3 = new WrongAnswer("q1a3");
        Answer q1a4 = new CorrectAnswer("q1a3");

        answer1.add(q1a1);
        answer1.add(q1a2);
        answer1.add(q1a3);
        answer1.add(q1a4);


        Question question1Diff1 = new Question("What is the first question?", 1, answer1);
        questionsLevel1.add(question1Diff1);

        List<Answer> answer2 = new ArrayList<>();
        Answer q2a1 = new WrongAnswer("q2a1");
        Answer q2a2 = new WrongAnswer("q2a2");
        Answer q2a3 = new WrongAnswer("q2a3");
        Answer q2a4 = new CorrectAnswer("q2a4");

        answer2.add(q2a1);
        answer2.add(q2a2);
        answer2.add(q2a3);
        answer2.add(q2a4);

        Question question2Diff1 = new Question("What is the second question?", 1, answer2);
        questionsLevel1.add(question2Diff1);

        List<Answer> answer3 = new ArrayList<>();
        Answer q3a1 = new WrongAnswer("q3a1");
        Answer q3a2 = new WrongAnswer("q3a2");
        Answer q3a3 = new WrongAnswer("q3a3");
        Answer q3a4 = new CorrectAnswer("q3a4");

        answer3.add(q3a1);
        answer3.add(q3a2);
        answer3.add(q3a3);
        answer3.add(q3a4);

        Question question1Diff2 = new Question("What is the second question?", 2, answer3);
        questionsLevel2.add(question1Diff2);

        List<Answer> answer4 = new ArrayList<>();
        Answer q4a1 = new WrongAnswer("q4a1");
        Answer q4a2 = new WrongAnswer("q4a2");
        Answer q4a3 = new WrongAnswer("q4a3");
        Answer q4a4 = new CorrectAnswer("q4a4");

        answer4.add(q4a1);
        answer4.add(q4a2);
        answer4.add(q4a3);
        answer4.add(q4a4);

        Question question2Diff2 = new Question("What is the third question?", 2, answer4);
        questionsLevel2.add(question2Diff2);

    }


    private static ArrayList<Question> getGameQuestions() {

        ArrayList<Question> questions = new ArrayList<>();
        Random r = new Random();

        int randomLevel1Index = r.nextInt(questionsLevel1.size());
        questions.add(questionsLevel1.get(randomLevel1Index));

        int randomLevel2Index = r.nextInt(questionsLevel2.size());
        questions.add(questionsLevel2.get(randomLevel2Index));

        return questions;

    }

}
