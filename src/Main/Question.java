package Main;

public abstract class Question {
    //class variable
    private String theQuestion;
    private String theAnswer;

    //constructor
    public Question(String question, String answer){
        this.theQuestion = question;
        this.theAnswer = answer;
    }
    //methods
    public abstract boolean checkAnswer(String answer);

    // getters and setters


    public String getTheAnswer() {
        return theAnswer;
    }

    public String getTheQuestion() {
        return theQuestion;
    }
    // main method
}
