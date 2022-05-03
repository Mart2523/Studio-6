package Main;

public class MultipleChoice extends Question{
    //variables

    //constructors
    public MultipleChoice(String question, String answer){
        super(question, answer);
    }
    //methods
    @Override
    public boolean checkAnswer(String answer){
        // Either A,B,C or D or a,b,c or d

        if (answer.toLowerCase().equals(this.getTheAnswer().toLowerCase())){
            return true;
        }
        else {return false;}
    }
}
