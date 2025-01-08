import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[3];
    String selection[] = new String[3];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", new String[] { "Mumbai", "Delhi", "Kolkata", "Chennai" }, "Delhi");
        questions[1] = new Question(2, "What is the capital of France?", new String[] { "Mumbai", "Paris", "Kolkata", "Chennai" }, "Paris");
        questions[2] = new Question(3, "What is the capital of USA?", new String[] { "Washington", "Delhi", "Kolkata", "Chennai" }, "Washington");
    }
    
    public void playQuiz(){
        
        int j=0;
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            String[] options = q.getOpt();
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + 1 + ". " + options[i]);
            }
            Scanner sc = new Scanner(System.in);
            selection[j++] = sc.nextLine();
        }
        System.out.println("Your answers are:");
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getAnswer().equals(selection[i])) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
        
    }
}