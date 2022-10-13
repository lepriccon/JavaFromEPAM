package ChapterOne.VarA;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "new";
        String master;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        master = scanner.nextLine();
        if (master.equals(password)){
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
