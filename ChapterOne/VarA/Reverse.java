package ChapterOne.VarA;

public class Reverse {
    public static void main(String[] args) {
        if (args.length != 0){
            for (int i = args.length-1; i > 0; i--){
                System.out.println(args[i]);
            }
        } else {
            System.out.println("wrong input");
        }

    }
}
