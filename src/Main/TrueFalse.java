package Main;

public class TrueFalse extends Question {
    //variables

    //constructors
    public TrueFalse(String question, String answer){
        super(question, answer);
    }
    //methods
    @Override
    public boolean checkAnswer(String answer){
        //True or False or true or false
        if (answer.toLowerCase().equals(this.getTheAnswer().toLowerCase())){
            return true;
        }
            else {return false;}
    }
}
