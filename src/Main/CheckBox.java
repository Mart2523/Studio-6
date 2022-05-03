package Main;

public class CheckBox extends Question {
    //variables

    //constructors
    public CheckBox(String question, String answer){
        super(question, answer);
    }
    //methods
    @Override
    public boolean checkAnswer(String answer){
        if (answer.toLowerCase().equals(this.getTheAnswer().toLowerCase())){
            return true;
        }
        else {return false;}
    }
}
