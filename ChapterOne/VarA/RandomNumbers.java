package ChapterOne.VarA;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        if (args.length != 0){
            Random random = new Random();
            for (int i = 0; i < Integer.parseInt(args[0]); i++ ) {
                System.out.println(random.nextInt());
            }
            for (int i = 0; i < Integer.parseInt(args[1]); i++ ) {
                System.out.print(random.nextInt() + " ");
            }
        }
    }
}
