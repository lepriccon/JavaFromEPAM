package ChapterOne.VarA;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(args.length);
        if (args.length != 0)
        System.out.println("hello " + args[0]);
    }
}
