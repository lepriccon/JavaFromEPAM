package ChapterOne.VarA;

import java.util.Scanner;

public class Base {
    public static String name;
    public static String password;

    public static void correctPassword (String inputPassword){
        if (inputPassword.equals(password)){
            System.out.println("password correct");
        } else {
            System.out.println("password incorrect, try again");
            correctPassword(new Scanner(System.in).nextLine());
        }
    }

}
