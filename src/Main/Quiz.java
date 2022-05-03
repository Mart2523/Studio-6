package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    //variables
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Question> questions = new ArrayList<Question>();
    int correctAnswers = 0;

    // constructors

    public Quiz (){

    }
    //methods

    public void addQuestion (Question question){
        this.questions.add(question);
    }
    public void runningQuiz (){
        for (Question question : questions){
            System.out.println(question.getTheQuestion());
        }
    }

}
