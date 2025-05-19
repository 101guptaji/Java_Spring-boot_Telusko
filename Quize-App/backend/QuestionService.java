import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
    
    ArrayList<Question> questions = new ArrayList<>();
    String[] selections;
    int marks=0;

    public void addQuestion(String quest, String[] options, String ans){
        Question question = new Question();
        question.setId(questions.size()+1);
        question.setQuestion(quest);
        question.setOptions(options);
        question.setAnswer(ans);

        questions.add(question);
    }

    public void printQuestions(){
        int n = questions.size();
        selections = new String[n];
        marks = 0;
        
        for(int i=0;i<n;i++){
            Question q = questions.get(i);
            System.out.print("\nQ.N. "+q.getId());
            System.out.println(": "+q.getQuestion());

            System.out.print("1. "+q.getOptions()[0]);
            System.out.println("\t\t\t2. "+q.getOptions()[1]);
            System.out.print("3. "+q.getOptions()[2]);
            System.out.println("\t\t\t4. "+q.getOptions()[3]);

            System.out.println("Please choose and enter a option");
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();

            System.out.println("Correct Answer: "+q.getAnswer());

            if(selections[i].equals(q.getAnswer())){
                marks++;
            }

            sc.close();
        }

        System.out.println("\nYou scored: "+marks+"/"+n+"\n");
    }
}
