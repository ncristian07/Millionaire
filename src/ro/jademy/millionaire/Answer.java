package ro.jademy.millionaire;

import java.util.Objects;

public abstract class Answer {

    private String answer;


    public Answer(String answer) {
        this.answer = answer;
    }

    abstract boolean isCorrect();
}

