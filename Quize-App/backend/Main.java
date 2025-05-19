public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();

        questionService.addQuestion("Which is Programming Language?", new String[]{"HTML", "CSS", "SQL", "Java"}, "Java");
        questionService.addQuestion("How to create a object in Java?", new String[]{"new", "create", "get", "set"}, "new");
        questionService.addQuestion("How to implement Interface in Java?", new String[]{"extends", "implements", "new", "throw"}, "implements");

        questionService.printQuestions();
    }
}
