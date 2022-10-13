package ChapterOne.VarA;

public class Calculate {
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("addition: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
            System.out.println("multiplication: " + (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
        }
    }
}
