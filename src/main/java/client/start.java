package hello;

public class Start {
public static void main(String[] args) {
    DeleteTopics deleteTopics = new DeleteTopics();
    System.out.println(deleteTopics.deleteAllTopics(args[0]));
    System.exit(0);
    }
}