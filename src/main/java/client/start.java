package puls;

public class Start {
public static void main(String[] args) {
    Delete deleteTopics = new Delete();
    System.out.println(deleteTopics.deleteAllTopics(args[0]));
    System.exit(0);
    }
}