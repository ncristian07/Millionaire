package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Millionaire {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();



        List<Question> questions1 = new ArrayList<>();
        List<Question> questions2 = new ArrayList<>();

        List<Answer> answer1 = new ArrayList<>();
        Answer q1a1 = new Answer("1875");
        Answer q1a2 = new Answer("1858");
        Answer q1a3 = new Answer("1931");
        Answer q1a4 = new Answer("1909", true);

        answer1.add(q1a1);
        answer1.add(q1a2);
        answer1.add(q1a3);
        answer1.add(q1a4);


        Question question1 = new Question("In which of the following years automobile manufacturer 'Audi' was founded?",1,answer1);

        List<Answer> answer2 = new ArrayList<>();
        Answer q2a1 = new Answer("K2");
        Answer q2a2 = new Answer("Kangchenjunga");
        Answer q2a3 = new Answer("Lhotse");
        Answer q2a4 = new Answer("Everest", true);

        answer2.add(q2a1);
        answer2.add(q2a2);
        answer2.add(q2a3);
        answer2.add(q2a4);

        Question question2 = new Question("Which of the following mountains is taller?",1,answer2);
    }
}
