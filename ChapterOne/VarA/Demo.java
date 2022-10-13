package ChapterOne.VarA;

import java.util.Random;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        if (args.length != 0 ){
            for (int i = args.length-1; i >= 0; i-- ){
                System.out.println(args[i]);
            }
        }

        System.out.println("What is you name?(type & press Enter)");
        Scanner scanner = new Scanner(System.in);
        Base.name = (scanner.nextLine());
        System.out.println("Input password for " + Base.name + " (type & press Enter)");
        Base.password = scanner.nextLine();
        System.out.println("Input numbers for addition and multiply: \n a: ");
        int operandOne = scanner.nextInt();
        System.out.println("b: ");
        int operandTwo = scanner.nextInt();
        System.out.println("a+b: " + (operandOne+operandTwo) + "\n" +
                            "a*b: " + operandOne * operandTwo);
        System.out.println("Input password : (type & press Enter)");
        Base.correctPassword(scanner.nextLine());

        System.out.println("how many random numbers you want get?\n with ln: (type & press Enter)");
        operandOne = scanner.nextInt();
        System.out.println("without ln (type & press Enter)");
        operandTwo = scanner.nextInt();
        random(operandOne, operandTwo);
    }

   public static void random(int withLn, int withoutLn){
        Random random = new Random();
        for (int i = 0; i < withLn; i++){
            System.out.println(random.nextInt());
        }
        for (int i = 0; i < withoutLn; i++){
            System.out.print(random.nextInt() + " ");
        }
    }

}
