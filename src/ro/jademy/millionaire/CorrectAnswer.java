package ro.jademy.millionaire;

public class CorrectAnswer extends Answer {


    public CorrectAnswer (String answerSentance){
        super(answerSentance);

    }
    @Override
    public boolean isCorrect(){
        return true;
    }


}
