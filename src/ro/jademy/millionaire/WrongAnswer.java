package ro.jademy.millionaire;

public class WrongAnswer extends Answer {

    public WrongAnswer (String answerSentance){
        super(answerSentance);

    }
    @Override
    public boolean isCorrect(){
        return false;
    }

}
