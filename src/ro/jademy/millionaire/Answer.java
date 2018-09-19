package ro.jademy.millionaire;

import java.util.Objects;

public class Answer {

  private   String answer;
  private   boolean correct;

  public Answer(String answer, boolean c){
      this.answer=answer;
      this.correct=c;
  }
    public Answer(String answer) {
        this.answer = answer;
        this.correct = false;
    }
  public String getAnswer(){
      return answer;
  }
  public boolean isCorrect(){
      return correct;
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer)) return false;
        Answer answer1 = (Answer) o;
        return correct == answer1.correct &&
                Objects.equals(answer, answer1.answer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(answer, correct);
    }

}
